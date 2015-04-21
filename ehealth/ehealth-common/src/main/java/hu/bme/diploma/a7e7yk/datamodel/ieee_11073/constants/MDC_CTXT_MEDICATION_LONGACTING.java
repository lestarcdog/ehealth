
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_MEDICATION_LONGACTING extends MdcNomenclatureValue {

  private static final MDC_CTXT_MEDICATION_LONGACTING _instance = new MDC_CTXT_MEDICATION_LONGACTING("MDC_CTXT_MEDICATION_LONGACTING", 29204, 128);

  private MDC_CTXT_MEDICATION_LONGACTING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_MEDICATION_LONGACTING get() {
    return _instance;
  }
}
