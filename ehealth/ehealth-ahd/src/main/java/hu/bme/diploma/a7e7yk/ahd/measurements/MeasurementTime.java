package hu.bme.diploma.a7e7yk.ahd.measurements;

import hu.bme.diploma.a7e7yk.ahd.AhdConstants;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MeasurementTime {

  private ZonedDateTime measurementTime;
  private ZoneId timeZone = AhdConstants.TIME_ZONE_BUDAPEST;

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
