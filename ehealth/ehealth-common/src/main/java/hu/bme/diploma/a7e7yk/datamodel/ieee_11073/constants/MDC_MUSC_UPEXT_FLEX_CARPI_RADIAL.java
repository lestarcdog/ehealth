
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_FLEX_CARPI_RADIAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_FLEX_CARPI_RADIAL _instance = new MDC_MUSC_UPEXT_FLEX_CARPI_RADIAL("MDC_MUSC_UPEXT_FLEX_CARPI_RADIAL", 664, 7);

  private MDC_MUSC_UPEXT_FLEX_CARPI_RADIAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_FLEX_CARPI_RADIAL get() {
    return _instance;
  }
}
