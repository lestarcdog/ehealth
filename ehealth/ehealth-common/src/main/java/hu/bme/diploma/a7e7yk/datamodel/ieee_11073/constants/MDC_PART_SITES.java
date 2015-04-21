
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_SITES extends MdcNomenclatureValue {

  private static final MDC_PART_SITES _instance = new MDC_PART_SITES("MDC_PART_SITES", 7, 0);

  private MDC_PART_SITES(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_SITES get() {
    return _instance;
  }
}
