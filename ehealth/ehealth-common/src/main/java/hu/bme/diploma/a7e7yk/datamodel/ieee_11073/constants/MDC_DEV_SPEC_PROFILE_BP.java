
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_BP extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_BP _instance = new MDC_DEV_SPEC_PROFILE_BP("MDC_DEV_SPEC_PROFILE_BP", 4103, 8);

  private MDC_DEV_SPEC_PROFILE_BP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_BP get() {
    return _instance;
  }
}
