
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_DIM extends MdcNomenclatureValue {

  private static final MDC_PART_DIM _instance = new MDC_PART_DIM("MDC_PART_DIM", 4, 0);

  private MDC_PART_DIM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_DIM get() {
    return _instance;
  }
}
