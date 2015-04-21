
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_LONGITUDE extends MdcNomenclatureValue {

  private static final MDC_HF_LONGITUDE _instance = new MDC_HF_LONGITUDE("MDC_HF_LONGITUDE", 107, 129);

  private MDC_HF_LONGITUDE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_LONGITUDE get() {
    return _instance;
  }
}
