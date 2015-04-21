
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MOC_VMO_METRIC_SA_RT extends MdcNomenclatureValue {

  private static final MDC_MOC_VMO_METRIC_SA_RT _instance = new MDC_MOC_VMO_METRIC_SA_RT("MDC_MOC_VMO_METRIC_SA_RT", 9, 1);

  private MDC_MOC_VMO_METRIC_SA_RT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MOC_VMO_METRIC_SA_RT get() {
    return _instance;
  }
}
