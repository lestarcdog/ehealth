package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class MeasurementHelper {

  private static final ZoneId GMT_ZONEID = ZoneId.of("GMT");

  public static void setObxField3(OBX obx, String identifier, String text, String codingSytem) throws DataTypeException {
    obx.getObx3_ObservationIdentifier().getCwe1_Identifier().setValue(identifier);
    obx.getObx3_ObservationIdentifier().getCwe2_Text().setValue(text);
    obx.getObx3_ObservationIdentifier().getCwe3_NameOfCodingSystem().setValue(codingSytem);
  }

  public static void setObxField6(OBX obx, String identifier, String text, String codingSytem) throws DataTypeException {
    obx.getObx6_Units().getCwe1_Identifier().setValue(identifier);
    obx.getObx6_Units().getCwe2_Text().setValue(text);
    obx.getObx6_Units().getCwe3_NameOfCodingSystem().setValue(codingSytem);
  }

  public static void setMeasurementMds(OBX obx, String identifier, String text, String codingSytem)
      throws DataTypeException {
    // first obx segment in measurement
  }

  public static OBX initValidObxSegment(OBX obx, ZonedDateTime measurementTime) throws DataTypeException {
    obx.getObx11_ObservationResultStatus().setValue("R");
    ZonedDateTime utc = measurementTime.withZoneSameInstant(GMT_ZONEID);
    obx.getObx14_DateTimeOfTheObservation().setValueToSecond();
    return obx;
  }

}
