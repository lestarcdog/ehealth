
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_IDCO_EXTN extends MdcNomenclatureValue {

  private static final MDC_PART_IDCO_EXTN _instance = new MDC_PART_IDCO_EXTN("MDC_PART_IDCO_EXTN", 11, 0);

  private MDC_PART_IDCO_EXTN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_IDCO_EXTN get() {
    return _instance;
  }
}
