package hu.bme.diploma.a7e7yk.datamodel.health.ieee_11073;


public class NomenclatureValue {
  private final int parentValue;
  private final String name;
  private final int value;

  public NomenclatureValue(String name, int value, int parentValue) {
    this.parentValue = parentValue;
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public int getValue() {
    return value;
  }



  public int getParentValue() {
    return parentValue;
  }


}
