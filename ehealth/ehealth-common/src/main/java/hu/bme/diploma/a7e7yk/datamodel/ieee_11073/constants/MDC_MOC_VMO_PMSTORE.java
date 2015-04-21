
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MOC_VMO_PMSTORE extends MdcNomenclatureValue {

  private static final MDC_MOC_VMO_PMSTORE _instance = new MDC_MOC_VMO_PMSTORE("MDC_MOC_VMO_PMSTORE", 61, 1);

  private MDC_MOC_VMO_PMSTORE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MOC_VMO_PMSTORE get() {
    return _instance;
  }
}
