
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_LATERALITY_LEFT extends MdcNomenclatureValue {

  private static final MDC_HF_LATERALITY_LEFT _instance = new MDC_HF_LATERALITY_LEFT("MDC_HF_LATERALITY_LEFT", 1202, 129);

  private MDC_HF_LATERALITY_LEFT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_LATERALITY_LEFT get() {
    return _instance;
  }
}
