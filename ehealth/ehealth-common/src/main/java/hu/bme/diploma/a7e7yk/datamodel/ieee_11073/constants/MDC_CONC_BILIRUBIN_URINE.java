
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CONC_BILIRUBIN_URINE extends MdcNomenclatureValue {

  private static final MDC_CONC_BILIRUBIN_URINE _instance = new MDC_CONC_BILIRUBIN_URINE("MDC_CONC_BILIRUBIN_URINE", 29152, 2);

  private MDC_CONC_BILIRUBIN_URINE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CONC_BILIRUBIN_URINE get() {
    return _instance;
  }
}
