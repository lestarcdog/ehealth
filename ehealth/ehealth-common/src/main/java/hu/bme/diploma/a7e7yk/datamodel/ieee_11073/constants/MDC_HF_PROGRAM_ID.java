
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_PROGRAM_ID extends MdcNomenclatureValue {

  private static final MDC_HF_PROGRAM_ID _instance = new MDC_HF_PROGRAM_ID("MDC_HF_PROGRAM_ID", 108, 129);

  private MDC_HF_PROGRAM_ID(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_PROGRAM_ID get() {
    return _instance;
  }
}
