
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_LEVATOR_ANGUL_ORIS extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_LEVATOR_ANGUL_ORIS _instance = new MDC_MUSC_HEAD_LEVATOR_ANGUL_ORIS("MDC_MUSC_HEAD_LEVATOR_ANGUL_ORIS", 336, 7);

  private MDC_MUSC_HEAD_LEVATOR_ANGUL_ORIS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_LEVATOR_ANGUL_ORIS get() {
    return _instance;
  }
}
