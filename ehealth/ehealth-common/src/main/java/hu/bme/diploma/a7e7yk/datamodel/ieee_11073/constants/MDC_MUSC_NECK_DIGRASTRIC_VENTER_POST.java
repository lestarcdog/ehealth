
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_NECK_DIGRASTRIC_VENTER_POST extends MdcNomenclatureValue {

  private static final MDC_MUSC_NECK_DIGRASTRIC_VENTER_POST _instance = new MDC_MUSC_NECK_DIGRASTRIC_VENTER_POST("MDC_MUSC_NECK_DIGRASTRIC_VENTER_POST", 412, 7);

  private MDC_MUSC_NECK_DIGRASTRIC_VENTER_POST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_NECK_DIGRASTRIC_VENTER_POST get() {
    return _instance;
  }
}
