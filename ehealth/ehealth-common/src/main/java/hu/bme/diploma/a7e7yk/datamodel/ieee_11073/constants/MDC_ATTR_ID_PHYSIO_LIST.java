
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_ID_PHYSIO_LIST extends MdcNomenclatureValue {

  private static final MDC_ATTR_ID_PHYSIO_LIST _instance = new MDC_ATTR_ID_PHYSIO_LIST("MDC_ATTR_ID_PHYSIO_LIST", 2678, 1);

  private MDC_ATTR_ID_PHYSIO_LIST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_ID_PHYSIO_LIST get() {
    return _instance;
  }
}
