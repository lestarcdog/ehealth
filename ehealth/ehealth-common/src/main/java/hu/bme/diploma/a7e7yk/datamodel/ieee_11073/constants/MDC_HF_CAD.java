
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_CAD extends MdcNomenclatureValue {

  private static final MDC_HF_CAD _instance = new MDC_HF_CAD("MDC_HF_CAD", 111, 129);

  private MDC_HF_CAD(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_CAD get() {
    return _instance;
  }
}
