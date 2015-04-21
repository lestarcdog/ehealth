
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_SCADA extends MdcNomenclatureValue {

  private static final MDC_PART_SCADA _instance = new MDC_PART_SCADA("MDC_PART_SCADA", 2, 0);

  private MDC_PART_SCADA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_SCADA get() {
    return _instance;
  }
}
