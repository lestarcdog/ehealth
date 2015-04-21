
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SCALE_SPECN_I8 extends MdcNomenclatureValue {

  private static final MDC_ATTR_SCALE_SPECN_I8 _instance = new MDC_ATTR_SCALE_SPECN_I8("MDC_ATTR_SCALE_SPECN_I8", 2417, 1);

  private MDC_ATTR_SCALE_SPECN_I8(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SCALE_SPECN_I8 get() {
    return _instance;
  }
}
