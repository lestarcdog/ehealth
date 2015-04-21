
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_SAT_O2_QUAL extends MdcNomenclatureValue {

  private static final MDC_SAT_O2_QUAL _instance = new MDC_SAT_O2_QUAL("MDC_SAT_O2_QUAL", 19248, 2);

  private MDC_SAT_O2_QUAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_SAT_O2_QUAL get() {
    return _instance;
  }
}
