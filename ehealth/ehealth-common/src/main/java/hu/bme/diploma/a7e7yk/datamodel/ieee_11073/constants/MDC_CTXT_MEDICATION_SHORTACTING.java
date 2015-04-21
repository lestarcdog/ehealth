
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_MEDICATION_SHORTACTING extends MdcNomenclatureValue {

  private static final MDC_CTXT_MEDICATION_SHORTACTING _instance = new MDC_CTXT_MEDICATION_SHORTACTING("MDC_CTXT_MEDICATION_SHORTACTING", 29196, 128);

  private MDC_CTXT_MEDICATION_SHORTACTING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_MEDICATION_SHORTACTING get() {
    return _instance;
  }
}
