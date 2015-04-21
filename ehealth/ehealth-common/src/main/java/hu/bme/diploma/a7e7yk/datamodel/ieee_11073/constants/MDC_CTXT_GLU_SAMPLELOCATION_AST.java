
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_SAMPLELOCATION_AST extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_SAMPLELOCATION_AST _instance = new MDC_CTXT_GLU_SAMPLELOCATION_AST("MDC_CTXT_GLU_SAMPLELOCATION_AST", 29244, 128);

  private MDC_CTXT_GLU_SAMPLELOCATION_AST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_SAMPLELOCATION_AST get() {
    return _instance;
  }
}
