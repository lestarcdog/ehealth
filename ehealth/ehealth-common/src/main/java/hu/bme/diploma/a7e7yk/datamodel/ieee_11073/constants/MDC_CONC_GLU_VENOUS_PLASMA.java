
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CONC_GLU_VENOUS_PLASMA extends MdcNomenclatureValue {

  private static final MDC_CONC_GLU_VENOUS_PLASMA _instance = new MDC_CONC_GLU_VENOUS_PLASMA("MDC_CONC_GLU_VENOUS_PLASMA", 29124, 2);

  private MDC_CONC_GLU_VENOUS_PLASMA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CONC_GLU_VENOUS_PLASMA get() {
    return _instance;
  }
}
