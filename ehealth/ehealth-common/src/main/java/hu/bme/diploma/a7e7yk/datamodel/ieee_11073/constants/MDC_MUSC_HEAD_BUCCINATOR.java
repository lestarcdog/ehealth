
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_BUCCINATOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_BUCCINATOR _instance = new MDC_MUSC_HEAD_BUCCINATOR("MDC_MUSC_HEAD_BUCCINATOR", 340, 7);

  private MDC_MUSC_HEAD_BUCCINATOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_BUCCINATOR get() {
    return _instance;
  }
}
