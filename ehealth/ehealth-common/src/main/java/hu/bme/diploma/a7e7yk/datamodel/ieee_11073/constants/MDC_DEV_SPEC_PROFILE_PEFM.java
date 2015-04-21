
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_PEFM extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_PEFM _instance = new MDC_DEV_SPEC_PROFILE_PEFM("MDC_DEV_SPEC_PROFILE_PEFM", 4117, 8);

  private MDC_DEV_SPEC_PROFILE_PEFM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_PEFM get() {
    return _instance;
  }
}
