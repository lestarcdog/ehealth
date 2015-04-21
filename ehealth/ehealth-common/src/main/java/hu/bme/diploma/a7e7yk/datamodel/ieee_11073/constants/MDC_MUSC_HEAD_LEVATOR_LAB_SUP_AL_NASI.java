
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_LEVATOR_LAB_SUP_AL_NASI extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_LEVATOR_LAB_SUP_AL_NASI _instance = new MDC_MUSC_HEAD_LEVATOR_LAB_SUP_AL_NASI("MDC_MUSC_HEAD_LEVATOR_LAB_SUP_AL_NASI", 328, 7);

  private MDC_MUSC_HEAD_LEVATOR_LAB_SUP_AL_NASI(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_LEVATOR_LAB_SUP_AL_NASI get() {
    return _instance;
  }
}
