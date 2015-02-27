package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class MeasurementHelper {

  private static final ZoneId GMT_ZONEID = ZoneId.of("GMT");

  public static void setObxField3ObservationId(OBX obx, String identifier, String text,
      String codingSytem) throws DataTypeException {
    obx.getObx3_ObservationIdentifier().getCwe1_Identifier().setValue(identifier);
    obx.getObx3_ObservationIdentifier().getCwe2_Text().setValue(text);
    obx.getObx3_ObservationIdentifier().getCwe3_NameOfCodingSystem().setValue(codingSytem);
  }

  public static void setObxField6Unit(OBX obx, String identifier, String text, String codingSytem)
      throws DataTypeException {
    obx.getObx6_Units().getCwe1_Identifier().setValue(identifier);
    obx.getObx6_Units().getCwe2_Text().setValue(text);
    obx.getObx6_Units().getCwe3_NameOfCodingSystem().setValue(codingSytem);
  }

  public static OBX initObxSegment(OBX obx, String resultStatus, ZonedDateTime measurementTime)
      throws DataTypeException {
    obx.getObx11_ObservationResultStatus().setValue(resultStatus);
    obx.getObx14_DateTimeOfTheObservation().setValue(convertDateTimeToGMTCalendar(measurementTime));
    return obx;
  }

  public static Calendar convertDateTimeToGMTCalendar(ZonedDateTime dateTime) {
    Calendar c = Calendar.getInstance();
    c.setTimeInMillis(dateTime.withZoneSameInstant(GMT_ZONEID).toInstant().toEpochMilli());
    return c;
  }

  public static Calendar convertDateTimeToCalendar(ZonedDateTime dateTime) {
    Calendar c = Calendar.getInstance();
    c.setTimeInMillis(dateTime.toInstant().toEpochMilli());
    return c;
  }

}
