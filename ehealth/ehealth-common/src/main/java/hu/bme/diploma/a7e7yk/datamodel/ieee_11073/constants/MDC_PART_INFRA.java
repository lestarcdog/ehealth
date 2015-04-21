
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_INFRA extends MdcNomenclatureValue {

  private static final MDC_PART_INFRA _instance = new MDC_PART_INFRA("MDC_PART_INFRA", 8, 0);

  private MDC_PART_INFRA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_INFRA get() {
    return _instance;
  }
}
