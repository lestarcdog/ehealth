
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_ELEC_POTL_AVL extends MdcNomenclatureValue {

  private static final MDC_ECG_ELEC_POTL_AVL _instance = new MDC_ECG_ELEC_POTL_AVL("MDC_ECG_ELEC_POTL_AVL", 319, 2);

  private MDC_ECG_ELEC_POTL_AVL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_ELEC_POTL_AVL get() {
    return _instance;
  }
}
