
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_SA_SPECN_FLAGS extends MdcNomenclatureValue {

  private static final MDC_SA_SPECN_FLAGS _instance = new MDC_SA_SPECN_FLAGS("MDC_SA_SPECN_FLAGS", 7692, 8);

  private MDC_SA_SPECN_FLAGS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_SA_SPECN_FLAGS get() {
    return _instance;
  }
}
