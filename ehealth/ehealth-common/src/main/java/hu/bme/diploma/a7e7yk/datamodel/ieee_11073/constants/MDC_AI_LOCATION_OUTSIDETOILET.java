
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_OUTSIDETOILET extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_OUTSIDETOILET _instance = new MDC_AI_LOCATION_OUTSIDETOILET("MDC_AI_LOCATION_OUTSIDETOILET", 3328, 130);

  private MDC_AI_LOCATION_OUTSIDETOILET(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_OUTSIDETOILET get() {
    return _instance;
  }
}
