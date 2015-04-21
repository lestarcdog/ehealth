
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_FLEX_CARPI_ULNAR extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_FLEX_CARPI_ULNAR _instance = new MDC_MUSC_UPEXT_FLEX_CARPI_ULNAR("MDC_MUSC_UPEXT_FLEX_CARPI_ULNAR", 672, 7);

  private MDC_MUSC_UPEXT_FLEX_CARPI_ULNAR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_FLEX_CARPI_ULNAR get() {
    return _instance;
  }
}
