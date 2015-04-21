
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_SPINAL_ERECTOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_SPINAL_ERECTOR _instance = new MDC_MUSC_BACK_SPINAL_ERECTOR("MDC_MUSC_BACK_SPINAL_ERECTOR", 472, 7);

  private MDC_MUSC_BACK_SPINAL_ERECTOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_SPINAL_ERECTOR get() {
    return _instance;
  }
}
