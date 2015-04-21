
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_ZYGOMATIC_MINOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_ZYGOMATIC_MINOR _instance = new MDC_MUSC_HEAD_ZYGOMATIC_MINOR("MDC_MUSC_HEAD_ZYGOMATIC_MINOR", 320, 7);

  private MDC_MUSC_HEAD_ZYGOMATIC_MINOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_ZYGOMATIC_MINOR get() {
    return _instance;
  }
}
