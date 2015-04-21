
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_MDS_TIME_INFO extends MdcNomenclatureValue {

  private static final MDC_ATTR_MDS_TIME_INFO _instance = new MDC_ATTR_MDS_TIME_INFO("MDC_ATTR_MDS_TIME_INFO", 2629, 1);

  private MDC_ATTR_MDS_TIME_INFO(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_MDS_TIME_INFO get() {
    return _instance;
  }
}
