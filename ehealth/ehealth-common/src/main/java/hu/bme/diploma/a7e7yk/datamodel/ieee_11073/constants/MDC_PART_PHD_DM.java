
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_PHD_DM extends MdcNomenclatureValue {

  private static final MDC_PART_PHD_DM _instance = new MDC_PART_PHD_DM("MDC_PART_PHD_DM", 128, 0);

  private MDC_PART_PHD_DM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_PHD_DM get() {
    return _instance;
  }
}
