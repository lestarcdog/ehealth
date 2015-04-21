
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_DAY extends MdcNomenclatureValue {

  private static final MDC_DIM_DAY _instance = new MDC_DIM_DAY("MDC_DIM_DAY", 2272, 4);

  private MDC_DIM_DAY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_DAY get() {
    return _instance;
  }
}
