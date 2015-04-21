
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_ID_INSTNO extends MdcNomenclatureValue {

  private static final MDC_ATTR_ID_INSTNO _instance = new MDC_ATTR_ID_INSTNO("MDC_ATTR_ID_INSTNO", 2338, 1);

  private MDC_ATTR_ID_INSTNO(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_ID_INSTNO get() {
    return _instance;
  }
}
