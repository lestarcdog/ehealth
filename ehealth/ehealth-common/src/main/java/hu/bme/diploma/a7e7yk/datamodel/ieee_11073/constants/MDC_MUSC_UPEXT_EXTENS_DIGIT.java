
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_EXTENS_DIGIT extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_EXTENS_DIGIT _instance = new MDC_MUSC_UPEXT_EXTENS_DIGIT("MDC_MUSC_UPEXT_EXTENS_DIGIT", 704, 7);

  private MDC_MUSC_UPEXT_EXTENS_DIGIT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_EXTENS_DIGIT get() {
    return _instance;
  }
}
