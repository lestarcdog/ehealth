package hu.bme.diploma.a7e7yk.datamodel.ieee_11073;

public class NomenclatureHelper {

  private static final int BIT16 = 65536;

  public static int getContinuaValueId(MdcNomenclatureValue value) {
    return value.getParentId() * BIT16 + value.getId();
  }

  public static int getIdFromContinuaValue(int continuaValue) {
    return (continuaValue & (BIT16 - 1));
  }

  public static int getIdFromContinuaValue(String continuaValueString) {
    return (Integer.parseInt(continuaValueString) & (BIT16 - 1));
  }

}
