
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ID_MODEL_NUMBER extends MdcNomenclatureValue {

  private static final MDC_ID_MODEL_NUMBER _instance = new MDC_ID_MODEL_NUMBER("MDC_ID_MODEL_NUMBER", 7681, 8);

  private MDC_ID_MODEL_NUMBER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ID_MODEL_NUMBER get() {
    return _instance;
  }
}
