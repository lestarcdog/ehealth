
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_INS_DELIV_BASAL extends MdcNomenclatureValue {

  private static final MDC_INS_DELIV_BASAL _instance = new MDC_INS_DELIV_BASAL("MDC_INS_DELIV_BASAL", 58368, 2);

  private MDC_INS_DELIV_BASAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_INS_DELIV_BASAL get() {
    return _instance;
  }
}
