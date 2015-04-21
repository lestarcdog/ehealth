
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_ELEC_POTL_I extends MdcNomenclatureValue {

  private static final MDC_ECG_ELEC_POTL_I _instance = new MDC_ECG_ELEC_POTL_I("MDC_ECG_ELEC_POTL_I", 257, 2);

  private MDC_ECG_ELEC_POTL_I(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_ELEC_POTL_I get() {
    return _instance;
  }
}
