
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_HR_MAX_USER extends MdcNomenclatureValue {

  private static final MDC_HF_HR_MAX_USER _instance = new MDC_HF_HR_MAX_USER("MDC_HF_HR_MAX_USER", 113, 129);

  private MDC_HF_HR_MAX_USER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_HR_MAX_USER get() {
    return _instance;
  }
}
