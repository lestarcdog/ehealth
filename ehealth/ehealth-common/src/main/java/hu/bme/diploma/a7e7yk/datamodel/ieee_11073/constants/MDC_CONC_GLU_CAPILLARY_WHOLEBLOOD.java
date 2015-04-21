
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD extends MdcNomenclatureValue {

  private static final MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD _instance = new MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD("MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD", 29112, 2);

  private MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD get() {
    return _instance;
  }
}
