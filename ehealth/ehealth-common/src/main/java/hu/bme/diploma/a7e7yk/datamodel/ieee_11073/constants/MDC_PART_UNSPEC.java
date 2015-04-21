
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_UNSPEC extends MdcNomenclatureValue {

  private static final MDC_PART_UNSPEC _instance = new MDC_PART_UNSPEC("MDC_PART_UNSPEC", 0, 0);

  private MDC_PART_UNSPEC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_UNSPEC get() {
    return _instance;
  }
}
