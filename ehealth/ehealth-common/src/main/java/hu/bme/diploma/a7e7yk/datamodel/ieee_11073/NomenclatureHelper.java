package hu.bme.diploma.a7e7yk.datamodel.ieee_11073;

public class NomenclatureHelper {

  private static final int BIT16 = 65536;

  public static int getContinuaValueId(NomenclatureValue value) {
    return value.getParentValue() * BIT16 + value.getValue();
  }

  public static int getIdFromContinuaValue(int continuaValue) {
    return (continuaValue & (BIT16 - 1));
  }

}
