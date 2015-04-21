
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_METRIC_ID_PART extends MdcNomenclatureValue {

  private static final MDC_ATTR_METRIC_ID_PART _instance = new MDC_ATTR_METRIC_ID_PART("MDC_ATTR_METRIC_ID_PART", 2655, 1);

  private MDC_ATTR_METRIC_ID_PART(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_METRIC_ID_PART get() {
    return _instance;
  }
}
