
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_PVT extends MdcNomenclatureValue {

  private static final MDC_PART_PVT _instance = new MDC_PART_PVT("MDC_PART_PVT", 1024, 0);

  private MDC_PART_PVT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_PVT get() {
    return _instance;
  }
}
