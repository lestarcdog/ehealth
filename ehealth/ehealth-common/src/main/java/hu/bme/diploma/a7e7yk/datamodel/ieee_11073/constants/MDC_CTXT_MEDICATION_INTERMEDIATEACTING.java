
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_MEDICATION_INTERMEDIATEACTING extends MdcNomenclatureValue {

  private static final MDC_CTXT_MEDICATION_INTERMEDIATEACTING _instance = new MDC_CTXT_MEDICATION_INTERMEDIATEACTING("MDC_CTXT_MEDICATION_INTERMEDIATEACTING", 29200, 128);

  private MDC_CTXT_MEDICATION_INTERMEDIATEACTING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_MEDICATION_INTERMEDIATEACTING get() {
    return _instance;
  }
}
