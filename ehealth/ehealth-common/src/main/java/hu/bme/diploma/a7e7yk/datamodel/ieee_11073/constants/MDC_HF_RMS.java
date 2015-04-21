
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_RMS extends MdcNomenclatureValue {

  private static final MDC_HF_RMS _instance = new MDC_HF_RMS("MDC_HF_RMS", 2004, 129);

  private MDC_HF_RMS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_RMS get() {
    return _instance;
  }
}
