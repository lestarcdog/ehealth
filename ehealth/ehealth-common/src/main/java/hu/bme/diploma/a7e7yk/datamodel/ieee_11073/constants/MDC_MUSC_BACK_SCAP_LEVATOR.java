
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_SCAP_LEVATOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_SCAP_LEVATOR _instance = new MDC_MUSC_BACK_SCAP_LEVATOR("MDC_MUSC_BACK_SCAP_LEVATOR", 452, 7);

  private MDC_MUSC_BACK_SCAP_LEVATOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_SCAP_LEVATOR get() {
    return _instance;
  }
}
