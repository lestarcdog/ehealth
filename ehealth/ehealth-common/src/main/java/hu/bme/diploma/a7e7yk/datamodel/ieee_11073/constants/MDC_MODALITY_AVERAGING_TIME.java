
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MODALITY_AVERAGING_TIME extends MdcNomenclatureValue {

  private static final MDC_MODALITY_AVERAGING_TIME _instance = new MDC_MODALITY_AVERAGING_TIME("MDC_MODALITY_AVERAGING_TIME", 7691, 8);

  private MDC_MODALITY_AVERAGING_TIME(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MODALITY_AVERAGING_TIME get() {
    return _instance;
  }
}
