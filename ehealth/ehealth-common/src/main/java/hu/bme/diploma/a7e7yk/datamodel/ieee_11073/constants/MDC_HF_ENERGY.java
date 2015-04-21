
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ENERGY extends MdcNomenclatureValue {

  private static final MDC_HF_ENERGY _instance = new MDC_HF_ENERGY("MDC_HF_ENERGY", 119, 129);

  private MDC_HF_ENERGY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ENERGY get() {
    return _instance;
  }
}
