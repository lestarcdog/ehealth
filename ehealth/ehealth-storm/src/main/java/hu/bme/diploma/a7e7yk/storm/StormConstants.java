package hu.bme.diploma.a7e7yk.storm;

import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;

import java.util.List;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;

public class StormConstants {
  /**
   * Patient identification, could be SSN or any specific identification
   */
  public static final String USER_ID_FIELD = "patientUserId";
  /**
   * Contains a {@link List} of {@link AbstractVitalSign} parsed data from the Continua message.
   */
  public static final String MEASUREMENTS_FIELD = "measurements";
  public static final String RETURN_MESSAGE_FIELD = "returnMessage";
  /**
   * Error message during the process it will be send back to the user for exception handling. Type
   * of {@link HL7Exception}
   */
  public static final String ERROR_FIELD = "errorMessage";
  /**
   * Unique identification of the sender of the message. Not health related data and not in the
   * message usually it comes from the Source (e.g RabbitMq)
   */
  public static final String SENDER_ID_FIELD = "senderId";
  /**
   * Unparsed string data of the HL7v2 message which should be parsable by the Continua
   * specification
   */
  public static final String UNPARSED_CONTINUA_MSG_FIELD = "UnparsedContinuaMsg";
  /**
   * Parsed HL7 v2 object type of {@link ORU_R01}
   */
  public static final String PARSED_CONTINUA_MSG_FIELD = "ParsedContinuaMsg";
}
