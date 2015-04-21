
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MOC_VMO_METRIC extends MdcNomenclatureValue {

  private static final MDC_MOC_VMO_METRIC _instance = new MDC_MOC_VMO_METRIC("MDC_MOC_VMO_METRIC", 4, 1);

  private MDC_MOC_VMO_METRIC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MOC_VMO_METRIC get() {
    return _instance;
  }
}
