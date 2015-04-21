
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_DESC_TIME_DIST extends MdcNomenclatureValue {

  private static final MDC_HF_DESC_TIME_DIST _instance = new MDC_HF_DESC_TIME_DIST("MDC_HF_DESC_TIME_DIST", 105, 129);

  private MDC_HF_DESC_TIME_DIST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_DESC_TIME_DIST get() {
    return _instance;
  }
}
