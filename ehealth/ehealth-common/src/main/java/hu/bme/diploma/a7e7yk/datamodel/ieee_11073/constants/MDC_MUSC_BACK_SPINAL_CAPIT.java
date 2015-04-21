
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_SPINAL_CAPIT extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_SPINAL_CAPIT _instance = new MDC_MUSC_BACK_SPINAL_CAPIT("MDC_MUSC_BACK_SPINAL_CAPIT", 488, 7);

  private MDC_MUSC_BACK_SPINAL_CAPIT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_SPINAL_CAPIT get() {
    return _instance;
  }
}
