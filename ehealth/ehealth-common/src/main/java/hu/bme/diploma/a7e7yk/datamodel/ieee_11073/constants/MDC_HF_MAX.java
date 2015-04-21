
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_MAX extends MdcNomenclatureValue {

  private static final MDC_HF_MAX _instance = new MDC_HF_MAX("MDC_HF_MAX", 2002, 129);

  private MDC_HF_MAX(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_MAX get() {
    return _instance;
  }
}
