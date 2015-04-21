
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_METRIC_STRUCT_SMALL extends MdcNomenclatureValue {

  private static final MDC_ATTR_METRIC_STRUCT_SMALL _instance = new MDC_ATTR_METRIC_STRUCT_SMALL("MDC_ATTR_METRIC_STRUCT_SMALL", 2675, 1);

  private MDC_ATTR_METRIC_STRUCT_SMALL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_METRIC_STRUCT_SMALL get() {
    return _instance;
  }
}
