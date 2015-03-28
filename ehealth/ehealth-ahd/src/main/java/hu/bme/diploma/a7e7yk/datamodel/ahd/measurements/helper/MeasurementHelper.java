package hu.bme.diploma.a7e7yk.datamodel.ahd.measurements.helper;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v26.datatype.CWE;
import ca.uhn.hl7v2.model.v26.datatype.NM;
import ca.uhn.hl7v2.model.v26.segment.OBX;

import com.google.common.base.Splitter;

public class MeasurementHelper {

  private static final TimeZone GMT_ZONEID = TimeZone.getTimeZone("GMT");

  public static void setObxField3ObservationId(OBX obx, String identifier, String text,
      String codingSytem) throws DataTypeException {
    obx.getObx3_ObservationIdentifier().getCwe1_Identifier().setValue(identifier);
    obx.getObx3_ObservationIdentifier().getCwe2_Text().setValue(text);
    obx.getObx3_ObservationIdentifier().getCwe3_NameOfCodingSystem().setValue(codingSytem);
  }

  public static void setObxField3ObservationId(OBX obx, String longid) throws DataTypeException {
    List<String> s = Splitter.on("^").splitToList(longid);
    setObxField3ObservationId(obx, s.get(0), s.get(1), s.get(2));
  }

  public static void setObxField5NMTypeValue(OBX obx, Message msg, Double value)
      throws DataTypeException {
    obx.getObx5_ObservationValue(0).setData(new NM(msg) {
      {
        setValue(value.toString());
      }
    });
  }

  public static void setObxField5CWETypeValue(OBX obx, Message msg, String cweString)
      throws DataTypeException {
    List<String> s = Splitter.on("^").splitToList(cweString);
    CWE cwe = new CWE(msg);
    obx.getObx5_ObservationValue(0).setData(cwe);
  }


  public static void setObxField6Unit(OBX obx, String identifier, String text, String codingSytem)
      throws DataTypeException {
    obx.getObx6_Units().getCwe1_Identifier().setValue(identifier);
    obx.getObx6_Units().getCwe2_Text().setValue(text);
    obx.getObx6_Units().getCwe3_NameOfCodingSystem().setValue(codingSytem);
  }

  public static void setObxField6Unit(OBX obx, String longid) throws DataTypeException {
    List<String> s = Splitter.on("^").splitToList(longid);
    setObxField6Unit(obx, s.get(0), s.get(1), s.get(2));
  }

  public static OBX initObxSegment(OBX obx, String resultStatus, ZonedDateTime measurementTime)
      throws DataTypeException {
    obx.getObx11_ObservationResultStatus().setValue(resultStatus);
    obx.getObx14_DateTimeOfTheObservation().setValue(convertDateTimeToGMTCalendar(measurementTime));
    return obx;
  }

  public static OBX setObxField18EII(OBX obx, String eui64) throws DataTypeException {
    List<String> s = Splitter.on("^").splitToList(eui64);
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi1_EntityIdentifier().setValue(s.get(0));
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi2_NamespaceID().setValue(s.get(1));
    return obx;
  }

  public static Calendar convertDateTimeToGMTCalendar(ZonedDateTime dateTime) {
    Calendar gmt = Calendar.getInstance(GMT_ZONEID);
    gmt.setTimeInMillis(dateTime.toInstant().toEpochMilli());
    return gmt;
  }

  public static Calendar convertDateTimeToCalendar(ZonedDateTime dateTime) {
    Calendar c = Calendar.getInstance();
    c.setTimeInMillis(dateTime.toInstant().toEpochMilli());
    return c;
  }

}
