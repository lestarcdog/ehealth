
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_SAMPLELOCATION_FINGER extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_SAMPLELOCATION_FINGER _instance = new MDC_CTXT_GLU_SAMPLELOCATION_FINGER("MDC_CTXT_GLU_SAMPLELOCATION_FINGER", 29240, 128);

  private MDC_CTXT_GLU_SAMPLELOCATION_FINGER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_SAMPLELOCATION_FINGER get() {
    return _instance;
  }
}
