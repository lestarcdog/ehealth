
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_MOVEMENT_EXTENSION extends MdcNomenclatureValue {

  private static final MDC_HF_MOVEMENT_EXTENSION _instance = new MDC_HF_MOVEMENT_EXTENSION("MDC_HF_MOVEMENT_EXTENSION", 1301, 129);

  private MDC_HF_MOVEMENT_EXTENSION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_MOVEMENT_EXTENSION get() {
    return _instance;
  }
}
