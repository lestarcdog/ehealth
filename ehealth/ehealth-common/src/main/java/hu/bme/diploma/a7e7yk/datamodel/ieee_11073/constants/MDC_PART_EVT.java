
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_EVT extends MdcNomenclatureValue {

  private static final MDC_PART_EVT _instance = new MDC_PART_EVT("MDC_PART_EVT", 3, 0);

  private MDC_PART_EVT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_EVT get() {
    return _instance;
  }
}
