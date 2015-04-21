
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_VATTR extends MdcNomenclatureValue {

  private static final MDC_PART_VATTR _instance = new MDC_PART_VATTR("MDC_PART_VATTR", 5, 0);

  private MDC_PART_VATTR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_VATTR get() {
    return _instance;
  }
}
