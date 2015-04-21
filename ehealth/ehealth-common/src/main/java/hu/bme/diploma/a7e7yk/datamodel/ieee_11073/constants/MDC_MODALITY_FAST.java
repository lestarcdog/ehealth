
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MODALITY_FAST extends MdcNomenclatureValue {

  private static final MDC_MODALITY_FAST _instance = new MDC_MODALITY_FAST("MDC_MODALITY_FAST", 19508, 2);

  private MDC_MODALITY_FAST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MODALITY_FAST get() {
    return _instance;
  }
}
