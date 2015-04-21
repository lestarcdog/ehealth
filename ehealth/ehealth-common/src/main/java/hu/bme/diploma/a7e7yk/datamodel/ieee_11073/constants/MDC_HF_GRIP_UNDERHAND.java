
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_GRIP_UNDERHAND extends MdcNomenclatureValue {

  private static final MDC_HF_GRIP_UNDERHAND _instance = new MDC_HF_GRIP_UNDERHAND("MDC_HF_GRIP_UNDERHAND", 1402, 129);

  private MDC_HF_GRIP_UNDERHAND(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_GRIP_UNDERHAND get() {
    return _instance;
  }
}
