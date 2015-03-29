package hu.bme.diploma.a7e7yk.hl7conversion;

import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureConstants;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureHelper;

import java.util.List;
import java.util.ListIterator;

import ca.uhn.hl7v2.ErrorCode;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v26.datatype.CX;
import ca.uhn.hl7v2.model.v26.datatype.NM;
import ca.uhn.hl7v2.model.v26.group.ORU_R01_OBSERVATION;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;
import ca.uhn.hl7v2.model.v26.segment.OBX;
import ca.uhn.hl7v2.model.v26.segment.PID;

public class Hl7MessageConverter {

  public static List<AbstractVitalSignValue> getVitalSignValues(ORU_R01 message) throws HL7Exception {
    List<ORU_R01_OBSERVATION> observations = message.getPATIENT_RESULT().getORDER_OBSERVATION().getOBSERVATIONAll();
    if (observations == null || observations.isEmpty()) {
      throw new HL7Exception("Observation can not be empty", ErrorCode.REQUIRED_FIELD_MISSING);
    }
    ListIterator<ORU_R01_OBSERVATION> it = observations.listIterator();


    return null;
  }

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
    return null;
  }

  private static ActivityMonitorValue convertToActivityMonitorValue(ObxReader reader) throws HL7Exception {
    ActivityMonitorValue v = new ActivityMonitorValue();
    OBX obx;
    int valueId;
    while ((obx = reader.nextObxInMajorGroup()) != null) {
      valueId =
          NomenclatureHelper
              .getIdFromContinuaValue(obx.getObx3_ObservationIdentifier().getCwe1_Identifier().getValue());
      switch (valueId) {
        case NomenclatureConstants.MDC_DEV_SPEC_PROFILE_HF_CARDIO:
          break;
        case NomenclatureConstants.MDC_HF_ACT_UNKNOWN:
          break;
        case NomenclatureConstants.MDC_ATTR_TIME_PD_MSMT_ACTIVE:
          v.setActivePeriod(getDoubleObx5(obx));
          break;
        case NomenclatureConstants.MDC_HF_SPEED:
          v.setSpeed(getDoubleObx5(obx));
          break;
        case NomenclatureConstants.MDC_HF_ALT:
          v.setAltitude(getDoubleObx5(obx));
          break;
        default:
          throw new HL7Exception("Invali parameter for Activity monitor: " + valueId, ErrorCode.UNKNOWN_KEY_IDENTIFIER);
      }

    }
    return v;
  }

  private static Double getDoubleObx5(OBX obx) {
    return Double.parseDouble(((NM) obx.getObx5_ObservationValue(0).getData()).getValue());
  }

  private class ObxReader {
    private final ListIterator<ORU_R01_OBSERVATION> it;
    private int majorGroup = -1;

    public ObxReader(ListIterator<ORU_R01_OBSERVATION> iterator) {
      it = iterator;
    }

    public OBX advanceIteratorToNewMajorGroup() {
      OBX obx = null;
      while (it.hasNext()) {
        obx = it.next().getOBX();
        // break at next major group
        if (!obx.getObx4_ObservationSubID().getValue().contains(".")) {
          majorGroup = Integer.parseInt(obx.getObx4_ObservationSubID().getValue());
          it.previous();
          return obx;
        }
      }
      return null;
    }

    public OBX nextObxInMajorGroup() {
      while (it.hasNext()) {
        OBX obx = it.next().getOBX();
        if (obx.getObx4_ObservationSubID().getValue().contains(".")) {
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
