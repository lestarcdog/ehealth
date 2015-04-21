
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_SYNC_ACCURACY extends MdcNomenclatureValue {

  private static final MDC_TIME_SYNC_ACCURACY _instance = new MDC_TIME_SYNC_ACCURACY("MDC_TIME_SYNC_ACCURACY", 2685, 1);

  private MDC_TIME_SYNC_ACCURACY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_SYNC_ACCURACY get() {
    return _instance;
  }
}
