
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_CAL_INGEST extends MdcNomenclatureValue {

  private static final MDC_HF_CAL_INGEST _instance = new MDC_HF_CAL_INGEST("MDC_HF_CAL_INGEST", 120, 129);

  private MDC_HF_CAL_INGEST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_CAL_INGEST get() {
    return _instance;
  }
}
