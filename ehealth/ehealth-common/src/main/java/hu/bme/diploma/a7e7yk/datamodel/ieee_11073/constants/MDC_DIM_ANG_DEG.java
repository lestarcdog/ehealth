
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_ANG_DEG extends MdcNomenclatureValue {

  private static final MDC_DIM_ANG_DEG _instance = new MDC_DIM_ANG_DEG("MDC_DIM_ANG_DEG", 736, 4);

  private MDC_DIM_ANG_DEG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_ANG_DEG get() {
    return _instance;
  }
}
