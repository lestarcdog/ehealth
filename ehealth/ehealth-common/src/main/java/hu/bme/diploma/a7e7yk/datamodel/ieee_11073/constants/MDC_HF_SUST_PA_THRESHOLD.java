
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_SUST_PA_THRESHOLD extends MdcNomenclatureValue {

  private static final MDC_HF_SUST_PA_THRESHOLD _instance = new MDC_HF_SUST_PA_THRESHOLD("MDC_HF_SUST_PA_THRESHOLD", 122, 129);

  private MDC_HF_SUST_PA_THRESHOLD(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_SUST_PA_THRESHOLD get() {
    return _instance;
  }
}
