
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_ORBIC_ORIS extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_ORBIC_ORIS _instance = new MDC_MUSC_HEAD_ORBIC_ORIS("MDC_MUSC_HEAD_ORBIC_ORIS", 304, 7);

  private MDC_MUSC_HEAD_ORBIC_ORIS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_ORBIC_ORIS get() {
    return _instance;
  }
}
