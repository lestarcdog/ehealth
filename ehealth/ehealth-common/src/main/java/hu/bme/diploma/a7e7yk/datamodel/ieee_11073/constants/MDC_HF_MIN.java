
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_MIN extends MdcNomenclatureValue {

  private static final MDC_HF_MIN _instance = new MDC_HF_MIN("MDC_HF_MIN", 2003, 129);

  private MDC_HF_MIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_MIN get() {
    return _instance;
  }
}
