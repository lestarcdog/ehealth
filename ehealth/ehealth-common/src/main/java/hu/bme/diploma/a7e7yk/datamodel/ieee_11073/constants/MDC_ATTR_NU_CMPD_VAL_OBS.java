
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_NU_CMPD_VAL_OBS extends MdcNomenclatureValue {

  private static final MDC_ATTR_NU_CMPD_VAL_OBS _instance = new MDC_ATTR_NU_CMPD_VAL_OBS("MDC_ATTR_NU_CMPD_VAL_OBS", 2379, 1);

  private MDC_ATTR_NU_CMPD_VAL_OBS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_NU_CMPD_VAL_OBS get() {
    return _instance;
  }
}
