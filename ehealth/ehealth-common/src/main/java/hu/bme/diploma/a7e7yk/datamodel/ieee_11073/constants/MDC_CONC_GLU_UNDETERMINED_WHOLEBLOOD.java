
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CONC_GLU_UNDETERMINED_WHOLEBLOOD extends MdcNomenclatureValue {

  private static final MDC_CONC_GLU_UNDETERMINED_WHOLEBLOOD _instance = new MDC_CONC_GLU_UNDETERMINED_WHOLEBLOOD("MDC_CONC_GLU_UNDETERMINED_WHOLEBLOOD", 29292, 2);

  private MDC_CONC_GLU_UNDETERMINED_WHOLEBLOOD(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CONC_GLU_UNDETERMINED_WHOLEBLOOD get() {
    return _instance;
  }
}
