
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_INS_DELIV_BASAL_TEMP_ABS extends MdcNomenclatureValue {

  private static final MDC_INS_DELIV_BASAL_TEMP_ABS _instance = new MDC_INS_DELIV_BASAL_TEMP_ABS("MDC_INS_DELIV_BASAL_TEMP_ABS", 58276, 2);

  private MDC_INS_DELIV_BASAL_TEMP_ABS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_INS_DELIV_BASAL_TEMP_ABS get() {
    return _instance;
  }
}
