
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_ZYGOMATIC_MAJOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_ZYGOMATIC_MAJOR _instance = new MDC_MUSC_HEAD_ZYGOMATIC_MAJOR("MDC_MUSC_HEAD_ZYGOMATIC_MAJOR", 316, 7);

  private MDC_MUSC_HEAD_ZYGOMATIC_MAJOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_ZYGOMATIC_MAJOR get() {
    return _instance;
  }
}
