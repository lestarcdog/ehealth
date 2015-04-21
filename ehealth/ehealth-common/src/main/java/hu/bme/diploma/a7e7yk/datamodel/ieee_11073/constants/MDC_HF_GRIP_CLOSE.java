
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_GRIP_CLOSE extends MdcNomenclatureValue {

  private static final MDC_HF_GRIP_CLOSE _instance = new MDC_HF_GRIP_CLOSE("MDC_HF_GRIP_CLOSE", 1403, 129);

  private MDC_HF_GRIP_CLOSE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_GRIP_CLOSE get() {
    return _instance;
  }
}
