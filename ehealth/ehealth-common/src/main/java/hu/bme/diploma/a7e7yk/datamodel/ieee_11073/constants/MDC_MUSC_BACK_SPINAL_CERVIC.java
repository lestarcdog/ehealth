
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_SPINAL_CERVIC extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_SPINAL_CERVIC _instance = new MDC_MUSC_BACK_SPINAL_CERVIC("MDC_MUSC_BACK_SPINAL_CERVIC", 484, 7);

  private MDC_MUSC_BACK_SPINAL_CERVIC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_SPINAL_CERVIC get() {
    return _instance;
  }
}
