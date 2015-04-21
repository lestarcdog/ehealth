
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_ECG_EXTN extends MdcNomenclatureValue {

  private static final MDC_PART_ECG_EXTN _instance = new MDC_PART_ECG_EXTN("MDC_PART_ECG_EXTN", 10, 0);

  private MDC_PART_ECG_EXTN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_ECG_EXTN get() {
    return _instance;
  }
}
