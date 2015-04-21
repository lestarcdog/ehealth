
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_ADDUC_POLLIC extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_ADDUC_POLLIC _instance = new MDC_MUSC_UPEXT_ADDUC_POLLIC("MDC_MUSC_UPEXT_ADDUC_POLLIC", 752, 7);

  private MDC_MUSC_UPEXT_ADDUC_POLLIC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_ADDUC_POLLIC get() {
    return _instance;
  }
}
