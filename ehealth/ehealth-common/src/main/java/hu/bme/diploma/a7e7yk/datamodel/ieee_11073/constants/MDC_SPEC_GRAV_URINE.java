
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_SPEC_GRAV_URINE extends MdcNomenclatureValue {

  private static final MDC_SPEC_GRAV_URINE _instance = new MDC_SPEC_GRAV_URINE("MDC_SPEC_GRAV_URINE", 28972, 2);

  private MDC_SPEC_GRAV_URINE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_SPEC_GRAV_URINE get() {
    return _instance;
  }
}
