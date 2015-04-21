
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_PHD_HF extends MdcNomenclatureValue {

  private static final MDC_PART_PHD_HF _instance = new MDC_PART_PHD_HF("MDC_PART_PHD_HF", 129, 0);

  private MDC_PART_PHD_HF(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_PHD_HF get() {
    return _instance;
  }
}
