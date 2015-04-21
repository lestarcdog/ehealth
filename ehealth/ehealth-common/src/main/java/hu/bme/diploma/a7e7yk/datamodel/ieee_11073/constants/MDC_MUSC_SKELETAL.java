
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_SKELETAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_SKELETAL _instance = new MDC_MUSC_SKELETAL("MDC_MUSC_SKELETAL", 248, 7);

  private MDC_MUSC_SKELETAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_SKELETAL get() {
    return _instance;
  }
}
