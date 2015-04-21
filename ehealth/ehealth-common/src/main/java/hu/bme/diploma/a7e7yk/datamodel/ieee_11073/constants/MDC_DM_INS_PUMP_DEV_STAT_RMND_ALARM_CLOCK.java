
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_RMND_ALARM_CLOCK extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_RMND_ALARM_CLOCK _instance = new MDC_DM_INS_PUMP_DEV_STAT_RMND_ALARM_CLOCK("MDC_DM_INS_PUMP_DEV_STAT_RMND_ALARM_CLOCK", 30018, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_RMND_ALARM_CLOCK(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_RMND_ALARM_CLOCK get() {
    return _instance;
  }
}
