
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_AL_COND extends MdcNomenclatureValue {

  private static final MDC_ATTR_AL_COND _instance = new MDC_ATTR_AL_COND("MDC_ATTR_AL_COND", 2476, 1);

  private MDC_ATTR_AL_COND(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_AL_COND get() {
    return _instance;
  }
}
