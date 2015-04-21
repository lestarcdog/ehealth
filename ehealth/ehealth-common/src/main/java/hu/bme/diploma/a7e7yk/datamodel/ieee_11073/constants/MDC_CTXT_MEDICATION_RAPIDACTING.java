
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_MEDICATION_RAPIDACTING extends MdcNomenclatureValue {

  private static final MDC_CTXT_MEDICATION_RAPIDACTING _instance = new MDC_CTXT_MEDICATION_RAPIDACTING("MDC_CTXT_MEDICATION_RAPIDACTING", 29192, 128);

  private MDC_CTXT_MEDICATION_RAPIDACTING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_MEDICATION_RAPIDACTING get() {
    return _instance;
  }
}
