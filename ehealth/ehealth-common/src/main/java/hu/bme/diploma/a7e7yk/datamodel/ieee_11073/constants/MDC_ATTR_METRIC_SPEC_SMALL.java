
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_METRIC_SPEC_SMALL extends MdcNomenclatureValue {

  private static final MDC_ATTR_METRIC_SPEC_SMALL _instance = new MDC_ATTR_METRIC_SPEC_SMALL("MDC_ATTR_METRIC_SPEC_SMALL", 2630, 1);

  private MDC_ATTR_METRIC_SPEC_SMALL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_METRIC_SPEC_SMALL get() {
    return _instance;
  }
}
