
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_KG_PER_M_SQ extends MdcNomenclatureValue {

  private static final MDC_DIM_KG_PER_M_SQ _instance = new MDC_DIM_KG_PER_M_SQ("MDC_DIM_KG_PER_M_SQ", 1952, 4);

  private MDC_DIM_KG_PER_M_SQ(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_KG_PER_M_SQ get() {
    return _instance;
  }
}
