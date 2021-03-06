
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_ELEC_POTL_III extends MdcNomenclatureValue {

  private static final MDC_ECG_ELEC_POTL_III _instance = new MDC_ECG_ELEC_POTL_III("MDC_ECG_ELEC_POTL_III", 317, 2);

  private MDC_ECG_ELEC_POTL_III(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_ELEC_POTL_III get() {
    return _instance;
  }
}
