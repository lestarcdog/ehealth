
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_SOFA extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_SOFA _instance = new MDC_AI_LOCATION_SOFA("MDC_AI_LOCATION_SOFA", 11392, 130);

  private MDC_AI_LOCATION_SOFA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_SOFA get() {
    return _instance;
  }
}
