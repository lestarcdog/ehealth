
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_NECK_DIGRASTRIC extends MdcNomenclatureValue {

  private static final MDC_MUSC_NECK_DIGRASTRIC _instance = new MDC_MUSC_NECK_DIGRASTRIC("MDC_MUSC_NECK_DIGRASTRIC", 404, 7);

  private MDC_MUSC_NECK_DIGRASTRIC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_NECK_DIGRASTRIC get() {
    return _instance;
  }
}
