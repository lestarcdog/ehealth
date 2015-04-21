
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_FLOW_AWAY_EXP_FORCED_PEAK_PB extends MdcNomenclatureValue {

  private static final MDC_FLOW_AWAY_EXP_FORCED_PEAK_PB _instance = new MDC_FLOW_AWAY_EXP_FORCED_PEAK_PB("MDC_FLOW_AWAY_EXP_FORCED_PEAK_PB", 21513, 2);

  private MDC_FLOW_AWAY_EXP_FORCED_PEAK_PB(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_FLOW_AWAY_EXP_FORCED_PEAK_PB get() {
    return _instance;
  }
}
