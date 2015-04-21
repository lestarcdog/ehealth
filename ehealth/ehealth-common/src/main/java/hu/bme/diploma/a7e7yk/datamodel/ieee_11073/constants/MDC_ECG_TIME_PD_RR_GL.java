
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_TIME_PD_RR_GL extends MdcNomenclatureValue {

  private static final MDC_ECG_TIME_PD_RR_GL _instance = new MDC_ECG_TIME_PD_RR_GL("MDC_ECG_TIME_PD_RR_GL", 16168, 2);

  private MDC_ECG_TIME_PD_RR_GL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_TIME_PD_RR_GL get() {
    return _instance;
  }
}
