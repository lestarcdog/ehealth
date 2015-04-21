
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CONC_GLU_GEN extends MdcNomenclatureValue {

  private static final MDC_CONC_GLU_GEN _instance = new MDC_CONC_GLU_GEN("MDC_CONC_GLU_GEN", 28948, 2);

  private MDC_CONC_GLU_GEN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CONC_GLU_GEN get() {
    return _instance;
  }
}
