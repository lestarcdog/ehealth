
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_GRIP_OVERHAND extends MdcNomenclatureValue {

  private static final MDC_HF_GRIP_OVERHAND _instance = new MDC_HF_GRIP_OVERHAND("MDC_HF_GRIP_OVERHAND", 1401, 129);

  private MDC_HF_GRIP_OVERHAND(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_GRIP_OVERHAND get() {
    return _instance;
  }
}
