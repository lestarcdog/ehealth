
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_NU_ACCUR_MSMT extends MdcNomenclatureValue {

  private static final MDC_ATTR_NU_ACCUR_MSMT _instance = new MDC_ATTR_NU_ACCUR_MSMT("MDC_ATTR_NU_ACCUR_MSMT", 2378, 1);

  private MDC_ATTR_NU_ACCUR_MSMT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_NU_ACCUR_MSMT get() {
    return _instance;
  }
}
