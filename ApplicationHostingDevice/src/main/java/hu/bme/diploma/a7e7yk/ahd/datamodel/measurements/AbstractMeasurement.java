package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.RegistrationCertificateModel;
import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import hu.bme.diploma.a7e7yk.ahd.datamodel.data.TimeModel;
import hu.bme.diploma.a7e7yk.ahd.runtime.IMessageBuilder;

import java.util.ArrayList;
import java.util.List;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public abstract class AbstractMeasurement implements IMeasurement {
  private TimeModel timeModel;
  private RegistrationCertificateModel registrationCertificateModel;
  private final SnomedConcept universalServiceIdentifier;
  protected final IMessageBuilder builder;
  protected String majorGroup;

  public AbstractMeasurement(SnomedConcept universalServiceIdentifier, IMessageBuilder builder, String majorGroup) {
    this.universalServiceIdentifier = universalServiceIdentifier;
    this.builder = builder;
    this.majorGroup = majorGroup;
  }

  protected abstract List<OBX> getMeasurementOBXs() throws DataTypeException;

  public List<OBX> getOBXs() throws DataTypeException {
    List<OBX> obxs = new ArrayList<OBX>();
    // put the bitches other here
    obxs.addAll(getMeasurementOBXs());
    return obxs;
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

}
