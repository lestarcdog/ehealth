
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_BATCHCODE_COAG extends MdcNomenclatureValue {

  private static final MDC_BATCHCODE_COAG _instance = new MDC_BATCHCODE_COAG("MDC_BATCHCODE_COAG", 29300, 128);

  private MDC_BATCHCODE_COAG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_BATCHCODE_COAG get() {
    return _instance;
  }
}
