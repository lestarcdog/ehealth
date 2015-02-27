package hu.bme.diploma.a7e7yk.ahd.datamodel.data;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeModel {
  private static final String TIME_ZONE = "Europe/Budapest";

  String timeSyncProtocol;
  Double timeSyncAccuracy;
  Double timeResolutionAbsolute;
  Double timeResolutionRelative;
  ZonedDateTime measurementTime;
  ZoneId timeZone = ZoneId.of(TIME_ZONE);

  public String getTimeSyncProtocol() {
    return timeSyncProtocol;
  }

  public void setTimeSyncProtocol(String timeSyncProtocol) {
    this.timeSyncProtocol = timeSyncProtocol;
  }

  public Double getTimeSyncAccuracy() {
    return timeSyncAccuracy;
  }

  public void setTimeSyncAccuracy(Double timeSyncAccuracy) {
    this.timeSyncAccuracy = timeSyncAccuracy;
  }

  public Double getTimeResolutionAbsolute() {
    return timeResolutionAbsolute;
  }

  public void setTimeResolutionAbsolute(Double timeResolutionAbsolute) {
    this.timeResolutionAbsolute = timeResolutionAbsolute;
  }

  public Double getTimeResolutionRelative() {
    return timeResolutionRelative;
  }

  public void setTimeResolutionRelative(Double timeResolutionRelative) {
    this.timeResolutionRelative = timeResolutionRelative;
  }

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
