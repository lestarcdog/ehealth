
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MODALITY_SLOW extends MdcNomenclatureValue {

  private static final MDC_MODALITY_SLOW _instance = new MDC_MODALITY_SLOW("MDC_MODALITY_SLOW", 19512, 2);

  private MDC_MODALITY_SLOW(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MODALITY_SLOW get() {
    return _instance;
  }
}
