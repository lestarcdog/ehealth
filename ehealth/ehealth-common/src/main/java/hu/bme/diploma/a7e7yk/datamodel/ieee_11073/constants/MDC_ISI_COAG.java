
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ISI_COAG extends MdcNomenclatureValue {

  private static final MDC_ISI_COAG _instance = new MDC_ISI_COAG("MDC_ISI_COAG", 29200, 2);

  private MDC_ISI_COAG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ISI_COAG get() {
    return _instance;
  }
}
