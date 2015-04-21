
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CONC_GLU_CONTROL extends MdcNomenclatureValue {

  private static final MDC_CONC_GLU_CONTROL _instance = new MDC_CONC_GLU_CONTROL("MDC_CONC_GLU_CONTROL", 29136, 2);

  private MDC_CONC_GLU_CONTROL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CONC_GLU_CONTROL get() {
    return _instance;
  }
}
