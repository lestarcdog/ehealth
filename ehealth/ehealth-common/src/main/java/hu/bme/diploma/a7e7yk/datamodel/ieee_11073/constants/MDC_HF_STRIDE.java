
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_STRIDE extends MdcNomenclatureValue {

  private static final MDC_HF_STRIDE _instance = new MDC_HF_STRIDE("MDC_HF_STRIDE", 117, 129);

  private MDC_HF_STRIDE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_STRIDE get() {
    return _instance;
  }
}
