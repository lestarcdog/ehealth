
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_SAMPLELOCATION_CTRLSOLUTION extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_SAMPLELOCATION_CTRLSOLUTION _instance = new MDC_CTXT_GLU_SAMPLELOCATION_CTRLSOLUTION("MDC_CTXT_GLU_SAMPLELOCATION_CTRLSOLUTION", 29252, 128);

  private MDC_CTXT_GLU_SAMPLELOCATION_CTRLSOLUTION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_SAMPLELOCATION_CTRLSOLUTION get() {
    return _instance;
  }
}
