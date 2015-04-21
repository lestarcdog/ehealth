
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_METRIC_STORE_SAMPLE_ALG extends MdcNomenclatureValue {

  private static final MDC_ATTR_METRIC_STORE_SAMPLE_ALG _instance = new MDC_ATTR_METRIC_STORE_SAMPLE_ALG("MDC_ATTR_METRIC_STORE_SAMPLE_ALG", 2371, 1);

  private MDC_ATTR_METRIC_STORE_SAMPLE_ALG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_METRIC_STORE_SAMPLE_ALG get() {
    return _instance;
  }
}
