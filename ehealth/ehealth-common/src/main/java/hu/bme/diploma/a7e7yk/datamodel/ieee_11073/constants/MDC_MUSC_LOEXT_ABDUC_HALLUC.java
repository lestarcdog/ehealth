
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_ABDUC_HALLUC extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_ABDUC_HALLUC _instance = new MDC_MUSC_LOEXT_ABDUC_HALLUC("MDC_MUSC_LOEXT_ABDUC_HALLUC", 960, 7);

  private MDC_MUSC_LOEXT_ABDUC_HALLUC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_ABDUC_HALLUC get() {
    return _instance;
  }
}
