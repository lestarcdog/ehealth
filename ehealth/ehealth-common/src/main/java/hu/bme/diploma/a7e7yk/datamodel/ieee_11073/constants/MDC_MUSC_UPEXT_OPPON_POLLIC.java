
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_OPPON_POLLIC extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_OPPON_POLLIC _instance = new MDC_MUSC_UPEXT_OPPON_POLLIC("MDC_MUSC_UPEXT_OPPON_POLLIC", 748, 7);

  private MDC_MUSC_UPEXT_OPPON_POLLIC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_OPPON_POLLIC get() {
    return _instance;
  }
}
