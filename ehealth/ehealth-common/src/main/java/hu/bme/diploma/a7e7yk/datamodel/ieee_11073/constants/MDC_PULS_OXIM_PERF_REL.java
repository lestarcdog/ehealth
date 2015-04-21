
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PULS_OXIM_PERF_REL extends MdcNomenclatureValue {

  private static final MDC_PULS_OXIM_PERF_REL _instance = new MDC_PULS_OXIM_PERF_REL("MDC_PULS_OXIM_PERF_REL", 19376, 2);

  private MDC_PULS_OXIM_PERF_REL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PULS_OXIM_PERF_REL get() {
    return _instance;
  }
}
