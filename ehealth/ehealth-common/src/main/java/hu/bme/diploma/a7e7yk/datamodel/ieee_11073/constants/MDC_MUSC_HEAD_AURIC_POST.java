
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_AURIC_POST extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_AURIC_POST _instance = new MDC_MUSC_HEAD_AURIC_POST("MDC_MUSC_HEAD_AURIC_POST", 300, 7);

  private MDC_MUSC_HEAD_AURIC_POST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_AURIC_POST get() {
    return _instance;
  }
}
