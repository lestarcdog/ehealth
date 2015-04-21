
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_PHD_AI extends MdcNomenclatureValue {

  private static final MDC_PART_PHD_AI _instance = new MDC_PART_PHD_AI("MDC_PART_PHD_AI", 130, 0);

  private MDC_PART_PHD_AI(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_PHD_AI get() {
    return _instance;
  }
}
