
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MOC_VMO_METRIC_ENUM extends MdcNomenclatureValue {

  private static final MDC_MOC_VMO_METRIC_ENUM _instance = new MDC_MOC_VMO_METRIC_ENUM("MDC_MOC_VMO_METRIC_ENUM", 5, 1);

  private MDC_MOC_VMO_METRIC_ENUM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MOC_VMO_METRIC_ENUM get() {
    return _instance;
  }
}
