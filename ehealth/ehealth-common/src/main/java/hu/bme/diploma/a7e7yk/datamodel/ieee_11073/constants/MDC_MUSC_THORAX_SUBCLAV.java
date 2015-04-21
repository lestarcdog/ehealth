
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_THORAX_SUBCLAV extends MdcNomenclatureValue {

  private static final MDC_MUSC_THORAX_SUBCLAV _instance = new MDC_MUSC_THORAX_SUBCLAV("MDC_MUSC_THORAX_SUBCLAV", 540, 7);

  private MDC_MUSC_THORAX_SUBCLAV(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_THORAX_SUBCLAV get() {
    return _instance;
  }
}
