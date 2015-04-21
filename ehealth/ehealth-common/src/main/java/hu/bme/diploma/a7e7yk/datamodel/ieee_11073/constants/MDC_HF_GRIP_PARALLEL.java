
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_GRIP_PARALLEL extends MdcNomenclatureValue {

  private static final MDC_HF_GRIP_PARALLEL _instance = new MDC_HF_GRIP_PARALLEL("MDC_HF_GRIP_PARALLEL", 1400, 129);

  private MDC_HF_GRIP_PARALLEL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_GRIP_PARALLEL get() {
    return _instance;
  }
}
