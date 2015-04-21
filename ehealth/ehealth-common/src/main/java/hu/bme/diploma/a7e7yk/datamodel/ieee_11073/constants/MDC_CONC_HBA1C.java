
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CONC_HBA1C extends MdcNomenclatureValue {

  private static final MDC_CONC_HBA1C _instance = new MDC_CONC_HBA1C("MDC_CONC_HBA1C", 29148, 2);

  private MDC_CONC_HBA1C(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CONC_HBA1C get() {
    return _instance;
  }
}
