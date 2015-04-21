
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_POSITION_KNEELING extends MdcNomenclatureValue {

  private static final MDC_HF_POSITION_KNEELING _instance = new MDC_HF_POSITION_KNEELING("MDC_HF_POSITION_KNEELING", 1207, 129);

  private MDC_HF_POSITION_KNEELING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_POSITION_KNEELING get() {
    return _instance;
  }
}
