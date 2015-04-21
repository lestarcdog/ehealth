
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_VOL_AWAY_EXP_FORCED_1S extends MdcNomenclatureValue {

  private static final MDC_VOL_AWAY_EXP_FORCED_1S _instance = new MDC_VOL_AWAY_EXP_FORCED_1S("MDC_VOL_AWAY_EXP_FORCED_1S", 21514, 2);

  private MDC_VOL_AWAY_EXP_FORCED_1S(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_VOL_AWAY_EXP_FORCED_1S get() {
    return _instance;
  }
}
