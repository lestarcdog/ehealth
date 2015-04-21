
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_GLU_METER_DEV_STATUS extends MdcNomenclatureValue {

  private static final MDC_GLU_METER_DEV_STATUS _instance = new MDC_GLU_METER_DEV_STATUS("MDC_GLU_METER_DEV_STATUS", 29144, 128);

  private MDC_GLU_METER_DEV_STATUS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_GLU_METER_DEV_STATUS get() {
    return _instance;
  }
}
