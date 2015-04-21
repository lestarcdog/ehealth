
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_THORAX_DIAPHRAGM extends MdcNomenclatureValue {

  private static final MDC_MUSC_THORAX_DIAPHRAGM _instance = new MDC_MUSC_THORAX_DIAPHRAGM("MDC_MUSC_THORAX_DIAPHRAGM", 552, 7);

  private MDC_MUSC_THORAX_DIAPHRAGM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_THORAX_DIAPHRAGM get() {
    return _instance;
  }
}
