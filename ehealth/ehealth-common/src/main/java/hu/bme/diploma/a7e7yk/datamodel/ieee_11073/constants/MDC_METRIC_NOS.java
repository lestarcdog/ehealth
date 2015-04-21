
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_METRIC_NOS extends MdcNomenclatureValue {

  private static final MDC_METRIC_NOS _instance = new MDC_METRIC_NOS("MDC_METRIC_NOS", 61439, 2);

  private MDC_METRIC_NOS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_METRIC_NOS get() {
    return _instance;
  }
}
