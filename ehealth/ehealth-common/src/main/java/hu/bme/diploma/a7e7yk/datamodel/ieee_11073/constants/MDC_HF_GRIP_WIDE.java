
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_GRIP_WIDE extends MdcNomenclatureValue {

  private static final MDC_HF_GRIP_WIDE _instance = new MDC_HF_GRIP_WIDE("MDC_HF_GRIP_WIDE", 1404, 129);

  private MDC_HF_GRIP_WIDE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_GRIP_WIDE get() {
    return _instance;
  }
}
