package hu.bme.diploma.a7e7yk.datamodel.health.ieee_11073;

public class NomenclatureHelper {

  private static final int BIT16 = 65536;

  public int getContinuaValueId(NomenclatureValue value) {
    return value.getParentValue() * BIT16 + value.getValue();
  }

  public int getIdFromContinuaValue(int continuaValue) {
    return continuaValue & (BIT16 - 1);
  }

}
