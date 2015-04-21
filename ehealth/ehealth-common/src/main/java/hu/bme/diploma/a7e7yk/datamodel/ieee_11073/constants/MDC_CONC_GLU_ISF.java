
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CONC_GLU_ISF extends MdcNomenclatureValue {

  private static final MDC_CONC_GLU_ISF _instance = new MDC_CONC_GLU_ISF("MDC_CONC_GLU_ISF", 29140, 2);

  private MDC_CONC_GLU_ISF(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CONC_GLU_ISF get() {
    return _instance;
  }
}
