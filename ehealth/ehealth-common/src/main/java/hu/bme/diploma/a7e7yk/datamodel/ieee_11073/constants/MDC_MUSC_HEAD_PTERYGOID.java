
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_PTERYGOID extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_PTERYGOID _instance = new MDC_MUSC_HEAD_PTERYGOID("MDC_MUSC_HEAD_PTERYGOID", 356, 7);

  private MDC_MUSC_HEAD_PTERYGOID(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_PTERYGOID get() {
    return _instance;
  }
}
