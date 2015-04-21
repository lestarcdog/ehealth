
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_ABDUC_MAGN extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_ABDUC_MAGN _instance = new MDC_MUSC_LOEXT_ABDUC_MAGN("MDC_MUSC_LOEXT_ABDUC_MAGN", 864, 7);

  private MDC_MUSC_LOEXT_ABDUC_MAGN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_ABDUC_MAGN get() {
    return _instance;
  }
}
