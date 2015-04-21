
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CONC_GLU_CAPILLARY_PLASMA extends MdcNomenclatureValue {

  private static final MDC_CONC_GLU_CAPILLARY_PLASMA _instance = new MDC_CONC_GLU_CAPILLARY_PLASMA("MDC_CONC_GLU_CAPILLARY_PLASMA", 29116, 2);

  private MDC_CONC_GLU_CAPILLARY_PLASMA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CONC_GLU_CAPILLARY_PLASMA get() {
    return _instance;
  }
}
