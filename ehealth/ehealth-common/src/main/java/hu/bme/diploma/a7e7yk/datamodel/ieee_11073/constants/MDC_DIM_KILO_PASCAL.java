
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_KILO_PASCAL extends MdcNomenclatureValue {

  private static final MDC_DIM_KILO_PASCAL _instance = new MDC_DIM_KILO_PASCAL("MDC_DIM_KILO_PASCAL", 3843, 4);

  private MDC_DIM_KILO_PASCAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_KILO_PASCAL get() {
    return _instance;
  }
}
