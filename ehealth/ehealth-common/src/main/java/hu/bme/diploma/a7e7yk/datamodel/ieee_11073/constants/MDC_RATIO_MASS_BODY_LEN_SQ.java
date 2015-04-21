
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_RATIO_MASS_BODY_LEN_SQ extends MdcNomenclatureValue {

  private static final MDC_RATIO_MASS_BODY_LEN_SQ _instance = new MDC_RATIO_MASS_BODY_LEN_SQ("MDC_RATIO_MASS_BODY_LEN_SQ", 57680, 2);

  private MDC_RATIO_MASS_BODY_LEN_SQ(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_RATIO_MASS_BODY_LEN_SQ get() {
    return _instance;
  }
}
