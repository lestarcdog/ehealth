
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_INTERSPINAL_CERVIC extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_INTERSPINAL_CERVIC _instance = new MDC_MUSC_BACK_INTERSPINAL_CERVIC("MDC_MUSC_BACK_INTERSPINAL_CERVIC", 516, 7);

  private MDC_MUSC_BACK_INTERSPINAL_CERVIC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_INTERSPINAL_CERVIC get() {
    return _instance;
  }
}
