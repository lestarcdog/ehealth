
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_NECK_DIGRASTRIC_VENTER_ANT extends MdcNomenclatureValue {

  private static final MDC_MUSC_NECK_DIGRASTRIC_VENTER_ANT _instance = new MDC_MUSC_NECK_DIGRASTRIC_VENTER_ANT("MDC_MUSC_NECK_DIGRASTRIC_VENTER_ANT", 408, 7);

  private MDC_MUSC_NECK_DIGRASTRIC_VENTER_ANT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_NECK_DIGRASTRIC_VENTER_ANT get() {
    return _instance;
  }
}
