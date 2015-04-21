
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_METRIC_STORE_CAPAC_CNT extends MdcNomenclatureValue {

  private static final MDC_ATTR_METRIC_STORE_CAPAC_CNT _instance = new MDC_ATTR_METRIC_STORE_CAPAC_CNT("MDC_ATTR_METRIC_STORE_CAPAC_CNT", 2369, 1);

  private MDC_ATTR_METRIC_STORE_CAPAC_CNT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_METRIC_STORE_CAPAC_CNT get() {
    return _instance;
  }
}
