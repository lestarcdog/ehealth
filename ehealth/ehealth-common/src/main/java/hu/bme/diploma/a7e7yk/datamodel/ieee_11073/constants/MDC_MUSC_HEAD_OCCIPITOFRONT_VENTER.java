
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_OCCIPITOFRONT_VENTER extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_OCCIPITOFRONT_VENTER _instance = new MDC_MUSC_HEAD_OCCIPITOFRONT_VENTER("MDC_MUSC_HEAD_OCCIPITOFRONT_VENTER", 288, 7);

  private MDC_MUSC_HEAD_OCCIPITOFRONT_VENTER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_OCCIPITOFRONT_VENTER get() {
    return _instance;
  }
}
