
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_AGE extends MdcNomenclatureValue {

  private static final MDC_HF_AGE _instance = new MDC_HF_AGE("MDC_HF_AGE", 126, 129);

  private MDC_HF_AGE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_AGE get() {
    return _instance;
  }
}
