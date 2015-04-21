
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_RESP_RATE extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_RESP_RATE _instance = new MDC_DEV_SPEC_PROFILE_RESP_RATE("MDC_DEV_SPEC_PROFILE_RESP_RATE", 4109, 8);

  private MDC_DEV_SPEC_PROFILE_RESP_RATE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_RESP_RATE get() {
    return _instance;
  }
}
