
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_MEDICATION_PREMIX extends MdcNomenclatureValue {

  private static final MDC_CTXT_MEDICATION_PREMIX _instance = new MDC_CTXT_MEDICATION_PREMIX("MDC_CTXT_MEDICATION_PREMIX", 29208, 128);

  private MDC_CTXT_MEDICATION_PREMIX(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_MEDICATION_PREMIX get() {
    return _instance;
  }
}
