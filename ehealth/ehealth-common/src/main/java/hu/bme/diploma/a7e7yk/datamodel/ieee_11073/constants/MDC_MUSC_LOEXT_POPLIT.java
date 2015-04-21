
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_POPLIT extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_POPLIT _instance = new MDC_MUSC_LOEXT_POPLIT("MDC_MUSC_LOEXT_POPLIT", 940, 7);

  private MDC_MUSC_LOEXT_POPLIT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_POPLIT get() {
    return _instance;
  }
}
