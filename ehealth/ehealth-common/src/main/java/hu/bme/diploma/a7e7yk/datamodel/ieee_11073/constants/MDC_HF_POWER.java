
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_POWER extends MdcNomenclatureValue {

  private static final MDC_HF_POWER _instance = new MDC_HF_POWER("MDC_HF_POWER", 115, 129);

  private MDC_HF_POWER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_POWER get() {
    return _instance;
  }
}
