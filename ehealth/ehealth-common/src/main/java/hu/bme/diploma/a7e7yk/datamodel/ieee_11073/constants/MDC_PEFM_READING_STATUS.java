
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PEFM_READING_STATUS extends MdcNomenclatureValue {

  private static final MDC_PEFM_READING_STATUS _instance = new MDC_PEFM_READING_STATUS("MDC_PEFM_READING_STATUS", 30720, 128);

  private MDC_PEFM_READING_STATUS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PEFM_READING_STATUS get() {
    return _instance;
  }
}
