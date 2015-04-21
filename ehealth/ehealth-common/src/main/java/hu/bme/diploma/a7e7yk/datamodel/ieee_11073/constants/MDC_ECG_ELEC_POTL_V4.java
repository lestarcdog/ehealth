
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_ELEC_POTL_V4 extends MdcNomenclatureValue {

  private static final MDC_ECG_ELEC_POTL_V4 _instance = new MDC_ECG_ELEC_POTL_V4("MDC_ECG_ELEC_POTL_V4", 262, 2);

  private MDC_ECG_ELEC_POTL_V4(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_ELEC_POTL_V4 get() {
    return _instance;
  }
}
