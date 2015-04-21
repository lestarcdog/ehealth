
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_NECK_STERNOCLEIDOMASTOID extends MdcNomenclatureValue {

  private static final MDC_MUSC_NECK_STERNOCLEIDOMASTOID _instance = new MDC_MUSC_NECK_STERNOCLEIDOMASTOID("MDC_MUSC_NECK_STERNOCLEIDOMASTOID", 400, 7);

  private MDC_MUSC_NECK_STERNOCLEIDOMASTOID(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_NECK_STERNOCLEIDOMASTOID get() {
    return _instance;
  }
}
