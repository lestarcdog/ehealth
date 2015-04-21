
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_CAL_INGEST_CARB extends MdcNomenclatureValue {

  private static final MDC_HF_CAL_INGEST_CARB _instance = new MDC_HF_CAL_INGEST_CARB("MDC_HF_CAL_INGEST_CARB", 121, 129);

  private MDC_HF_CAL_INGEST_CARB(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_CAL_INGEST_CARB get() {
    return _instance;
  }
}
