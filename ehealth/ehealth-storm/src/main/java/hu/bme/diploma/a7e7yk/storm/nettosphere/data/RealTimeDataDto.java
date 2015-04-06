package hu.bme.diploma.a7e7yk.storm.nettosphere.data;

import java.time.ZonedDateTime;

public class RealTimeDataDto {
  private String id;
  private ZonedDateTime time;
  private Double value;

  // public static final String TYPE = "RealTimeData";


  public RealTimeDataDto(String type, String id, ZonedDateTime time, Double value) {
    this.id = id;
    this.time = time;
    this.value = value;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ZonedDateTime getTime() {
    return time;
  }

  public void setTime(ZonedDateTime time) {
    this.time = time;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public String toString() {
    return "RealTimeDataDto [id=" + id + ", time=" + time + ", value=" + value + "]";
  }

}
