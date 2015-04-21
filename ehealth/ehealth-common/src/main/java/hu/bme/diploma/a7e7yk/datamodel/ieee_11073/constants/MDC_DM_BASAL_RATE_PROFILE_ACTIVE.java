
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_BASAL_RATE_PROFILE_ACTIVE extends MdcNomenclatureValue {

  private static final MDC_DM_BASAL_RATE_PROFILE_ACTIVE _instance = new MDC_DM_BASAL_RATE_PROFILE_ACTIVE("MDC_DM_BASAL_RATE_PROFILE_ACTIVE", 29696, 128);

  private MDC_DM_BASAL_RATE_PROFILE_ACTIVE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_BASAL_RATE_PROFILE_ACTIVE get() {
    return _instance;
  }
}
