package hu.bme.diploma.a7e7yk.converter.hl7converter;

import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.GlucoseVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.PulseOxyMeterVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ThermometerVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.WeightScaleVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureConstants;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureHelper;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;

import ca.uhn.hl7v2.ErrorCode;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.datatype.CX;
import ca.uhn.hl7v2.model.v26.datatype.NM;
import ca.uhn.hl7v2.model.v26.group.ORU_R01_OBSERVATION;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;
import ca.uhn.hl7v2.model.v26.segment.OBX;
import ca.uhn.hl7v2.model.v26.segment.PID;

public class Hl7MessageConverter {

  /**
   * Extracts the vital signs from a Hl7v2.7 Continua specified messages and returns them as a list.
   * 
   * @param message contains health info
   * @return list of converted objects
   * @throws HL7Exception can't convert to the domain object
   */
  public static List<AbstractVitalSign> getVitalSignValues(ORU_R01 message) throws HL7Exception {
    List<ORU_R01_OBSERVATION> observations = message.getPATIENT_RESULT().getORDER_OBSERVATION().getOBSERVATIONAll();
    if (observations == null || observations.isEmpty()) {
      throw new HL7Exception("Observation can not be empty", ErrorCode.REQUIRED_FIELD_MISSING);
    }
    ObxReader reader = new ObxReader(observations.listIterator());
    List<AbstractVitalSign> vitalSigns = new ArrayList<>();
    OBX obx;
    Integer valueId;
    while ((obx = reader.advanceIteratorToNewMajorGroup()) != null) {
      valueId = getObx3AsInteger(obx);
      switch (valueId) {
        case MdcNomenclatureConstants.MDC_DEV_SPEC_PROFILE_HF_CARDIO:
          vitalSigns.add(convertToActivityMonitorValue(reader));
          break;
        case MdcNomenclatureConstants.MDC_DEV_SPEC_PROFILE_BP:
          vitalSigns.add(convertToBloodPressureValue(reader));
          break;
        case MdcNomenclatureConstants.MDC_DEV_SPEC_PROFILE_GLUCOSE:
          vitalSigns.add(convertToGlucoseValue(reader));
          break;
        case MdcNomenclatureConstants.MDC_DEV_SPEC_PROFILE_PULS_OXIM:
          vitalSigns.add(convertToPulseOxymeterValue(reader));
          break;
        case MdcNomenclatureConstants.MDC_DEV_SPEC_PROFILE_TEMP:
          vitalSigns.add(convertToThermometerValue(reader));
          break;
        case MdcNomenclatureConstants.MDC_DEV_SPEC_PROFILE_SCALE:
          vitalSigns.add(convertToWeighScaleValue(reader));
          break;
        default:
          throw new HL7Exception("Invalid MDC parameter server can not process it: " + valueId,
              ErrorCode.UNKNOWN_KEY_IDENTIFIER);
      }
    }
    return vitalSigns;
  }

  /**
   * From the {@code message} object extract the PID segment and converts it data to the output
   * 
   * @param message Contains data about the person
   * @return The created object extracted from the input parameter
   * @throws HL7Exception
   */
  public static PersonModel getPersonModel(ORU_R01 message) throws HL7Exception {
    PersonModel m = new PersonModel();
    PID pid = message.getPATIENT_RESULT().getPATIENT().getPID();
    if (pid.getPid3_PatientIdentifierList().length == 0) {
      throw new HL7Exception("No patient identifier found in PID3", ErrorCode.REQUIRED_FIELD_MISSING);
    }
    CX id = pid.getPid3_PatientIdentifierList(0);
    m.setSsn(id.getCx1_IDNumber().getValue());
    if (pid.getPid5_PatientName() != null) {
      m.setFamilyName(pid.getPid5_PatientName(0).getFamilyName().getFn1_Surname().getValue());
      m.setGivenName(pid.getPid5_PatientName(0).getGivenName().getValue());
    }
    return m;
  }

  private static AbstractVitalSign convertToWeighScaleValue(ObxReader reader) throws HL7Exception {
    WeightScaleVitalSign v = new WeightScaleVitalSign();
    OBX obx;
    int valueId;
    while ((obx = reader.nextObxInMajorGroup()) != null) {
      valueId = getObx3AsInteger(obx);
      switch (valueId) {
        case MdcNomenclatureConstants.MDC_DEV_SPEC_PROFILE_SCALE:
          v.setMeasurementTime(getObx14AsZonedDateTime(obx));
          break;
        case MdcNomenclatureConstants.MDC_MASS_BODY_ACTUAL:
          v.getWeight().setValue(getObx5AsDouble(obx));
          break;
        case MdcNomenclatureConstants.MDC_LEN_BODY_ACTUAL:
          v.getHeight().setValue(getObx5AsDouble(obx));
        default:
          break;
      }
    }
    return v;
  }

  private static AbstractVitalSign convertToPulseOxymeterValue(ObxReader reader) throws HL7Exception {
    PulseOxyMeterVitalSign v = new PulseOxyMeterVitalSign();
    OBX obx;
    int valueId;
    while ((obx = reader.nextObxInMajorGroup()) != null) {
      valueId = getObx3AsInteger(obx);
      switch (valueId) {
        case MdcNomenclatureConstants.MDC_DEV_SPEC_PROFILE_PULS_OXIM:
          v.setMeasurementTime(getObx14AsZonedDateTime(obx));
          break;
        case MdcNomenclatureConstants.MDC_PULS_OXIM_SAT_O2:
          v.getSpo2().setValue(getObx5AsDouble(obx));
          break;
        case MdcNomenclatureConstants.MDC_PULS_OXIM_PULS_RATE:
          v.getPulseRate().setValue(getObx5AsDouble(obx));
        default:
          break;
      }
    }
    return v;
  }

  private static AbstractVitalSign convertToThermometerValue(ObxReader reader) throws HL7Exception {
    ThermometerVitalSign v = new ThermometerVitalSign();
    OBX obx;
    int valueId;
    while ((obx = reader.nextObxInMajorGroup()) != null) {
      valueId = getObx3AsInteger(obx);
      switch (valueId) {
        case MdcNomenclatureConstants.MDC_DEV_SPEC_PROFILE_TEMP:
          v.setMeasurementTime(getObx14AsZonedDateTime(obx));
          break;
        case MdcNomenclatureConstants.MDC_TEMP_BODY:
          v.getTemp().setValue(getObx5AsDouble(obx));
        default:
          break;
      }
    }
    return v;
  }

  private static ActivityMonitorVitalSign convertToActivityMonitorValue(ObxReader reader) throws HL7Exception {
    ActivityMonitorVitalSign v = new ActivityMonitorVitalSign();

    OBX obx;
    int valueId;
    while ((obx = reader.nextObxInMajorGroup()) != null) {
      valueId = getObx3AsInteger(obx);
      switch (valueId) {
        case MdcNomenclatureConstants.MDC_DEV_SPEC_PROFILE_HF_CARDIO:
          v.setMeasurementTime(getObx14AsZonedDateTime(obx));
          break;
        case MdcNomenclatureConstants.MDC_HF_SESSION:
          break;
        case MdcNomenclatureConstants.MDC_HF_ACT_UNKNOWN:
          break;
        case MdcNomenclatureConstants.MDC_ATTR_TIME_PD_MSMT_ACTIVE:
          v.getActivePeriod().setValue(getObx5AsDouble(obx));
          break;
        case MdcNomenclatureConstants.MDC_HF_SPEED:
          v.getSpeed().setValue(getObx5AsDouble(obx));
          break;
        case MdcNomenclatureConstants.MDC_HF_ALT:
          v.getAltitude().setValue(getObx5AsDouble(obx));
          break;
        default:
          throw new HL7Exception("Invalid parameter for Activity monitor: " + valueId, ErrorCode.UNKNOWN_KEY_IDENTIFIER);
      }
    }
    return v;
  }

  private static BloodPressureVitalSign convertToBloodPressureValue(ObxReader reader) throws HL7Exception {
    BloodPressureVitalSign v = new BloodPressureVitalSign();
    OBX obx;
    int valueId;
    while ((obx = reader.nextObxInMajorGroup()) != null) {
      valueId = getObx3AsInteger(obx);

      switch (valueId) {
        case MdcNomenclatureConstants.MDC_DEV_SPEC_PROFILE_BP:
          v.setMeasurementTime(getObx14AsZonedDateTime(obx));
          break;
        case MdcNomenclatureConstants.MDC_PRESS_BLD_NONINV:
          break;
        case MdcNomenclatureConstants.MDC_PRESS_BLD_NONINV_SYS:
          v.getSystolic().setValue(getObx5AsDouble(obx));
          break;
        case MdcNomenclatureConstants.MDC_PRESS_BLD_NONINV_DIA:
          v.getDiastolic().setValue(getObx5AsDouble(obx));
          break;
        case MdcNomenclatureConstants.MDC_PULS_RATE_NON_INV:
          v.getPulseRate().setValue(getObx5AsDouble(obx));
          break;
        default:
          throw new HL7Exception("Invalid parameter for blood pressure: " + valueId, ErrorCode.UNKNOWN_KEY_IDENTIFIER);
      }
    }
    return v;
  }

  private static GlucoseVitalSign convertToGlucoseValue(ObxReader reader) throws HL7Exception {
    GlucoseVitalSign v = new GlucoseVitalSign();
    OBX obx;
    int valueId;
    while ((obx = reader.nextObxInMajorGroup()) != null) {
      valueId = getObx3AsInteger(obx);
      switch (valueId) {
        case MdcNomenclatureConstants.MDC_DEV_SPEC_PROFILE_GLUCOSE:
          v.setMeasurementTime(getObx14AsZonedDateTime(obx));
          break;

        case MdcNomenclatureConstants.MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD:
          v.getGlucose().setValue(getObx5AsDouble(obx));
          break;
        default:
          throw new HL7Exception("Invalid parameter for glucose meter: " + valueId, ErrorCode.UNKNOWN_KEY_IDENTIFIER);
      }
    }
    return v;
  }

  /**
   * Gets Observation Value as double.
   * 
   * @param obx
   * @return
   */
  private static Double getObx5AsDouble(OBX obx) {
    String value = ((NM) obx.getObx5_ObservationValue(0).getData()).getValue();
    return value != null ? Double.parseDouble(value) : null;
  }

  /**
   * Gets Observation Identifier as integer.
   * 
   * @param obx
   * @return
   */
  private static Integer getObx3AsInteger(OBX obx) {
    return NomenclatureHelper.getIdFromContinuaValue(obx.getObx3_ObservationIdentifier().getCwe1_Identifier()
        .getValue());
  }

  /**
   * Gets Date/Time of Observation as {@link ZonedDateTime}
   * 
   * @param obx
   * @return
   * @throws HL7Exception
   */
  private static ZonedDateTime getObx14AsZonedDateTime(OBX obx) throws HL7Exception {
    try {
      Calendar c = obx.getObx14_DateTimeOfTheObservation().getValueAsCalendar();
      return ZonedDateTime.ofInstant(Instant.ofEpochMilli(c.getTimeInMillis()), ZoneId.of("GMT"));
    } catch (DataTypeException e) {
      throw new HL7Exception("Cant convert date:" + e.getMessage(), ErrorCode.DATA_TYPE_ERROR);
    }
  }

  private static class ObxReader {
    private final ListIterator<ORU_R01_OBSERVATION> it;
    private String majorGroup = "-1";

    public ObxReader(ListIterator<ORU_R01_OBSERVATION> iterator) {
      it = iterator;
    }

    public OBX advanceIteratorToNewMajorGroup() {
      OBX obx = null;
      while (it.hasNext()) {
        obx = it.next().getOBX();
        // break at next major group
        if (!obx.getObx4_ObservationSubID().getValue().contains(".")) {
          majorGroup = obx.getObx4_ObservationSubID().getValue();
          it.previous();
          return obx;
        }
      }
      return null;
    }

    public OBX nextObxInMajorGroup() {
      while (it.hasNext()) {
        OBX obx = it.next().getOBX();
        String subId = obx.getObx4_ObservationSubID().getValue();
        if (subId.equals(majorGroup) || obx.getObx4_ObservationSubID().getValue().contains(".")) {
          return obx;
        } else {
          it.previous();
          return null;
        }
      }
      return null;
    }
  }
}
