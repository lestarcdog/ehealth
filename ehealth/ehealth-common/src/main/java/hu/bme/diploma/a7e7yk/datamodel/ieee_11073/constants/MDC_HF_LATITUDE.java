
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_LATITUDE extends MdcNomenclatureValue {

  private static final MDC_HF_LATITUDE _instance = new MDC_HF_LATITUDE("MDC_HF_LATITUDE", 106, 129);

  private MDC_HF_LATITUDE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_LATITUDE get() {
    return _instance;
  }
}
