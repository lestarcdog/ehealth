
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_RESP_RATE extends MdcNomenclatureValue {

  private static final MDC_RESP_RATE _instance = new MDC_RESP_RATE("MDC_RESP_RATE", 20490, 2);

  private MDC_RESP_RATE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_RESP_RATE get() {
    return _instance;
  }
}
