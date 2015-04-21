
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_GRIP_GRIPLESS extends MdcNomenclatureValue {

  private static final MDC_HF_GRIP_GRIPLESS _instance = new MDC_HF_GRIP_GRIPLESS("MDC_HF_GRIP_GRIPLESS", 1405, 129);

  private MDC_HF_GRIP_GRIPLESS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_GRIP_GRIPLESS get() {
    return _instance;
  }
}
