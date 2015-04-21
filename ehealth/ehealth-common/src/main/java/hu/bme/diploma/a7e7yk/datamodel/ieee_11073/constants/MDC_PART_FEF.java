
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_FEF extends MdcNomenclatureValue {

  private static final MDC_PART_FEF _instance = new MDC_PART_FEF("MDC_PART_FEF", 9, 0);

  private MDC_PART_FEF(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_FEF get() {
    return _instance;
  }
}
