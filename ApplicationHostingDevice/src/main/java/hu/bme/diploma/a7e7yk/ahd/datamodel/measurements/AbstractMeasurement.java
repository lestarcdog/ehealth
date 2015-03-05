package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.RegistrationCertificateModel;
import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import hu.bme.diploma.a7e7yk.ahd.datamodel.data.TimeModel;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.helper.MeasurementHelper;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.interfaces.IMeasurement;
import hu.bme.diploma.a7e7yk.ahd.runtime.IMessageBuilder;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Objects;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.datatype.CX;
import ca.uhn.hl7v2.model.v26.datatype.EI;
import ca.uhn.hl7v2.model.v26.segment.MSH;
import ca.uhn.hl7v2.model.v26.segment.OBR;
import ca.uhn.hl7v2.model.v26.segment.PID;

import com.google.common.base.Joiner;

public abstract class AbstractMeasurement implements IMeasurement {
  protected TimeModel timeModel;
  private RegistrationCertificateModel registrationCertificateModel;
  private final SnomedConcept universalServiceIdentifier;
  protected IMessageBuilder builder;
  protected String majorGroup;
  private ZonedDateTime msgCreationTime;
  private boolean generateMDSSegments = false;
  private final ObservationalId obsId = new ObservationalId(1);


  public AbstractMeasurement(SnomedConcept universalServiceIdentifier) {
    this.universalServiceIdentifier = universalServiceIdentifier;
  }

  protected abstract void generateMeasurementOBXs() throws DataTypeException;

  private void generateMSH() throws DataTypeException {
    MSH msh = builder.provideMSH();
    msh.getMsh3_SendingApplication().getHd1_NamespaceID().setValue(builder.getAhdModel().getSendingApplicationName());
    msh.getMsh3_SendingApplication().getHd2_UniversalID().setValue(builder.getAhdModel().getSendingApplicationCode());
    msh.getMsh3_SendingApplication().getHd3_UniversalIDType()
        .setValue(builder.getAhdModel().getSendingApplicationFormat());
    msh.getMsh7_DateTimeOfMessage().setValue(MeasurementHelper.convertDateTimeToGMTCalendar(msgCreationTime));
    msh.getMsh15_AcceptAcknowledgmentType().setValue("NE");
    msh.getMsh16_ApplicationAcknowledgmentType().setValue("AL");
    // IHE PCD ORU-R012006^HL7^2.16.840.1.113883.9.n.m^HL7
    EI ei = msh.getMsh21_MessageProfileIdentifier(0);
    ei.getEi1_EntityIdentifier().setValue("IHE PCD ORU-R012006");
    ei.getEi2_NamespaceID().setValue("HL7");
    ei.getEi3_UniversalID().setValue("2.16.840.1.113883.9");
    ei.getEi4_UniversalIDType().setValue("HL7");
  }

  @Override
  public void generateMessage() throws DataTypeException {
    Objects.requireNonNull(timeModel);
    Objects.requireNonNull(builder.getPersonModel());
    Objects.requireNonNull(builder.getAhdModel());
    msgCreationTime = ZonedDateTime.now(timeModel.getTimeZone());
    // MSH
    generateMSH();
    // PID
    generatePID();
    // MDS Segments
    if (generateMDSSegments) {
      generateMDSSegments();
    }
    // OBR
    generateOBR();
    // put the bitches other here
    generateMeasurementOBXs();
  }

  private void generateMDSSegments() {
    throw new UnsupportedOperationException();
  }

  private void generatePID() throws DataTypeException {
    PID pid = builder.providePID();
    CX id = pid.getPid3_PatientIdentifierList(0);
    id.getCx1_IDNumber().setValue(builder.getPersonModel().getSsn());
    id.getCx4_AssigningAuthority().getHd2_UniversalID().setValue("OEP");
    id.getCx5_IdentifierTypeCode().setValue("SSN");
    pid.getPid5_PatientName(0).getFamilyName().getFn1_Surname().setValue(builder.getPersonModel().getFamilyName());
    pid.getPid5_PatientName(0).getGivenName().setValue(builder.getPersonModel().getGivenName());
    Calendar c = Calendar.getInstance();
    LocalDate db = builder.getPersonModel().getBirthDate();
    c.set(db.getYear(), db.getMonthValue(), db.getDayOfMonth());
    pid.getPid7_DateTimeOfBirth().setValue(c);
  }

  private void generateOBR() throws DataTypeException {
    OBR obr = builder.provideOBR();
    EI ei = obr.getObr2_PlacerOrderNumber();
    ei.getEi1_EntityIdentifier().setValue("AB1234");
    ei.getEi2_NamespaceID().setValue(builder.getAhdModel().getSendingApplicationName());
    ei.getEi3_UniversalID().setValue(builder.getAhdModel().getSendingApplicationCode());
    ei.getEi4_UniversalIDType().setValue("EUI-64");
    ei = obr.getObr3_FillerOrderNumber();
    ei.getEi1_EntityIdentifier().setValue("AB1234");
    ei.getEi2_NamespaceID().setValue(builder.getAhdModel().getSendingApplicationName());
    ei.getEi3_UniversalID().setValue(builder.getAhdModel().getSendingApplicationCode());
    ei.getEi4_UniversalIDType().setValue(builder.getAhdModel().getSendingApplicationFormat());
    obr.getObr4_UniversalServiceIdentifier().getCwe1_Identifier().setValue(universalServiceIdentifier.getSnomedId());
    obr.getObr4_UniversalServiceIdentifier().getCwe2_Text().setValue(universalServiceIdentifier.getSnomedName());
    obr.getObr4_UniversalServiceIdentifier().getCwe3_NameOfCodingSystem().setValue("SNOMED-CT");
    obr.getObr7_ObservationDateTime().setValue(
        MeasurementHelper.convertDateTimeToGMTCalendar(timeModel.getMeasurementTime()));
    obr.getObr8_ObservationEndDateTime().setValue(MeasurementHelper.convertDateTimeToGMTCalendar(msgCreationTime));
  }

  protected ObservationalId getObservationalId() {
    return obsId;
  }


  // getter / setters

  public TimeModel getTimeModel() {
    return timeModel;
  }

  public void setTimeModel(TimeModel timeModel) {
    this.timeModel = timeModel;
  }

  public RegistrationCertificateModel getRegistrationCertificateModel() {
    return registrationCertificateModel;
  }

  public void setRegistrationCertificateModel(RegistrationCertificateModel registrationCertificateModel) {
    this.registrationCertificateModel = registrationCertificateModel;
  }

  public SnomedConcept getUniversalServiceIdentifier() {
    return universalServiceIdentifier;
  }

  public void setBuilder(IMessageBuilder builder) {
    this.builder = builder;
  }

  public boolean isGenerateMDSSegments() {
    return generateMDSSegments;
  }

  public void setGenerateMDSSegments(boolean generateMDSSegments) {
    this.generateMDSSegments = generateMDSSegments;
  }

  protected class ObservationalId {
    private int first;
    private int second;
    private int third;
    private int fourth;
    private int fifth;

    public ObservationalId(int majorGroup) {
      this.first = majorGroup;
      restartCounters();
    }

    public void restartCounters() {
      second = third = fourth = fifth = 0;
    }

    public String getNextFourthId() {
      fourth++;
      fifth = 0;
      return Joiner.on(".").join(first, second, third, fourth);


    }

    public String getNextFifthId() {
      fifth++;
      return Joiner.on(".").join(first, second, third, fourth, fifth);

    }

    public String getNextThirdId() {
      third++;
      fourth = 0;
      fifth = 0;
      return Joiner.on(".").join(first, second, third);

    }

    public String getFirstGroup() {
      return Integer.toString(first);
    }

  }

}
