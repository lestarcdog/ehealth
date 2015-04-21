
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_RPM extends MdcNomenclatureValue {

  private static final MDC_DIM_RPM _instance = new MDC_DIM_RPM("MDC_DIM_RPM", 6816, 4);

  private MDC_DIM_RPM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_RPM get() {
    return _instance;
  }
}
