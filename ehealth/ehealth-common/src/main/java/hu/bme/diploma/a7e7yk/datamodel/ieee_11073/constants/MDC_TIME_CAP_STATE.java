
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_CAP_STATE extends MdcNomenclatureValue {

  private static final MDC_TIME_CAP_STATE _instance = new MDC_TIME_CAP_STATE("MDC_TIME_CAP_STATE", 2683, 1);

  private MDC_TIME_CAP_STATE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_CAP_STATE get() {
    return _instance;
  }
}
