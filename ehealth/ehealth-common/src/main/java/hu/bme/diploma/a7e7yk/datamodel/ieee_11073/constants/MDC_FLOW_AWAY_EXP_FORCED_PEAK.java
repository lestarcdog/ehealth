
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_FLOW_AWAY_EXP_FORCED_PEAK extends MdcNomenclatureValue {

  private static final MDC_FLOW_AWAY_EXP_FORCED_PEAK _instance = new MDC_FLOW_AWAY_EXP_FORCED_PEAK("MDC_FLOW_AWAY_EXP_FORCED_PEAK", 21512, 2);

  private MDC_FLOW_AWAY_EXP_FORCED_PEAK(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_FLOW_AWAY_EXP_FORCED_PEAK get() {
    return _instance;
  }
}
