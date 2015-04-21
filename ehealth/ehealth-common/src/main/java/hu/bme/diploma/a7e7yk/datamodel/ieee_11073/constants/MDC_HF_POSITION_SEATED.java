
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_POSITION_SEATED extends MdcNomenclatureValue {

  private static final MDC_HF_POSITION_SEATED _instance = new MDC_HF_POSITION_SEATED("MDC_HF_POSITION_SEATED", 1205, 129);

  private MDC_HF_POSITION_SEATED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_POSITION_SEATED get() {
    return _instance;
  }
}
