
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_RISOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_RISOR _instance = new MDC_MUSC_HEAD_RISOR("MDC_MUSC_HEAD_RISOR", 312, 7);

  private MDC_MUSC_HEAD_RISOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_RISOR get() {
    return _instance;
  }
}
