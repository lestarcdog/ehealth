package hu.bme.diploma.a7e7yk.hl7conversion;

import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSignValue;

import java.util.List;

import ca.uhn.hl7v2.ErrorCode;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;
import ca.uhn.hl7v2.model.v26.segment.PID;

public class Hl7MessageConverter {

  public static List<AbstractVitalSignValue> getVitalSignValues(ORU_R01 message)
      throws HL7Exception {
    return null;
  }

  public static PersonModel getPersonModel(ORU_R01 message) throws HL7Exception {
    PersonModel m = new PersonModel();
    PID pid = message.getPATIENT_RESULT().getPATIENT().getPID();
    if (pid.getPid3_PatientIdentifierList().length == 0) {
      throw new HL7Exception("No patient identifier found in PID3",
          ErrorCode.REQUIRED_FIELD_MISSING);
    }

    return null;
  }
}
