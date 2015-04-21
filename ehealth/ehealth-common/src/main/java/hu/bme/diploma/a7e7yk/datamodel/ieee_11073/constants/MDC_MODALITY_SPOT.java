
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MODALITY_SPOT extends MdcNomenclatureValue {

  private static final MDC_MODALITY_SPOT _instance = new MDC_MODALITY_SPOT("MDC_MODALITY_SPOT", 19516, 2);

  private MDC_MODALITY_SPOT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MODALITY_SPOT get() {
    return _instance;
  }
}
