package hu.bme.diploma.a7e7yk.storm.nettosphere.data;

public abstract class DataDto {
  private final String type;

  protected DataDto(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}
