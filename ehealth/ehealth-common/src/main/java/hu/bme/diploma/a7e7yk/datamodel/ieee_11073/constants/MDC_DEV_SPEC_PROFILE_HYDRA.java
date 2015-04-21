
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_HYDRA extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_HYDRA _instance = new MDC_DEV_SPEC_PROFILE_HYDRA("MDC_DEV_SPEC_PROFILE_HYDRA", 4096, 8);

  private MDC_DEV_SPEC_PROFILE_HYDRA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_HYDRA get() {
    return _instance;
  }
}
