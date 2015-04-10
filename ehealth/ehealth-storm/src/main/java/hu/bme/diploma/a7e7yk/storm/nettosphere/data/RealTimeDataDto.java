package hu.bme.diploma.a7e7yk.storm.nettosphere.data;


public class RealTimeDataDto {
  private String id;
  private String measurement;
  private Long time;
  private Double value;

  // public static final String TYPE = "RealTimeData";
  public RealTimeDataDto() {}

  public RealTimeDataDto(String id, Long time, Double value) {
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

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public String getMeasurement() {
    return measurement;
  }

  public void setMeasurement(String measurement) {
    this.measurement = measurement;
  }


  @Override
  public String toString() {
    return "RealTimeDataDto [id=" + id + ", measurement=" + measurement + ", time=" + time + ", value=" + value + "]";
  }



}
