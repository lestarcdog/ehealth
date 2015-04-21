
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_RESIST extends MdcNomenclatureValue {

  private static final MDC_HF_RESIST _instance = new MDC_HF_RESIST("MDC_HF_RESIST", 116, 129);

  private MDC_HF_RESIST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_RESIST get() {
    return _instance;
  }
}
