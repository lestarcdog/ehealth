
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_NECK_PLATYSMA extends MdcNomenclatureValue {

  private static final MDC_MUSC_NECK_PLATYSMA _instance = new MDC_MUSC_NECK_PLATYSMA("MDC_MUSC_NECK_PLATYSMA", 392, 7);

  private MDC_MUSC_NECK_PLATYSMA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_NECK_PLATYSMA get() {
    return _instance;
  }
}
