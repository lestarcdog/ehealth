
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MOC_SCAN extends MdcNomenclatureValue {

  private static final MDC_MOC_SCAN _instance = new MDC_MOC_SCAN("MDC_MOC_SCAN", 16, 1);

  private MDC_MOC_SCAN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MOC_SCAN get() {
    return _instance;
  }
}
