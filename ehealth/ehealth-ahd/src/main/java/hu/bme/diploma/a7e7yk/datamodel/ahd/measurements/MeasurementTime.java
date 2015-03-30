package hu.bme.diploma.a7e7yk.datamodel.ahd.measurements;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MeasurementTime {
  public static final String TIME_ZONE = "Europe/Budapest";

  private ZonedDateTime measurementTime;
  private ZoneId timeZone = ZoneId.of(TIME_ZONE);

  public ZonedDateTime getMeasurementTime() {
    return measurementTime;
  }

  public void setMeasurementTime(ZonedDateTime measurementTime) {
    this.measurementTime = measurementTime;
  }

  public ZoneId getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(ZoneId timeZone) {
    this.timeZone = timeZone;
  }


}
