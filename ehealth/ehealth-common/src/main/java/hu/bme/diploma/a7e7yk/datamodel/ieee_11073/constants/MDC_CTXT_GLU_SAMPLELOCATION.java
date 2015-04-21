
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_SAMPLELOCATION extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_SAMPLELOCATION _instance = new MDC_CTXT_GLU_SAMPLELOCATION("MDC_CTXT_GLU_SAMPLELOCATION", 29236, 128);

  private MDC_CTXT_GLU_SAMPLELOCATION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_SAMPLELOCATION get() {
    return _instance;
  }
}
