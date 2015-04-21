package hu.bme.diploma.a7e7yk.datamodel.ieee_11073;



public class MdcNomenclatureValue {
  private final int parentId;
  private final String name;
  private final int id;

  protected MdcNomenclatureValue(String name, int value, int parentValue) {
    this.parentId = parentValue;
    this.name = name;
    this.id = value;
  }

  public int getParentId() {
    return parentId;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "MdcNomenclatureValue [parentId=" + parentId + ", name=" + name + ", id=" + id + "]";
  }

  public static class Builder {
    public static MdcNomenclatureValue build(String name, int value, int parentValue) {
      return new MdcNomenclatureValue(name, value, parentValue);
    }
  }

}
