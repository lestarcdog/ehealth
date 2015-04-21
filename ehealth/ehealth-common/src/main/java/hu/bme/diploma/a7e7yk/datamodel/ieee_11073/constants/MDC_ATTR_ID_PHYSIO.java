
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_ID_PHYSIO extends MdcNomenclatureValue {

  private static final MDC_ATTR_ID_PHYSIO _instance = new MDC_ATTR_ID_PHYSIO("MDC_ATTR_ID_PHYSIO", 2347, 1);

  private MDC_ATTR_ID_PHYSIO(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_ID_PHYSIO get() {
    return _instance;
  }
}
