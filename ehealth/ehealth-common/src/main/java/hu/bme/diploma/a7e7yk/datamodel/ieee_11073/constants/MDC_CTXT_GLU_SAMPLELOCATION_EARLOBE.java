
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_SAMPLELOCATION_EARLOBE extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_SAMPLELOCATION_EARLOBE _instance = new MDC_CTXT_GLU_SAMPLELOCATION_EARLOBE("MDC_CTXT_GLU_SAMPLELOCATION_EARLOBE", 29248, 128);

  private MDC_CTXT_GLU_SAMPLELOCATION_EARLOBE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_SAMPLELOCATION_EARLOBE get() {
    return _instance;
  }
}
