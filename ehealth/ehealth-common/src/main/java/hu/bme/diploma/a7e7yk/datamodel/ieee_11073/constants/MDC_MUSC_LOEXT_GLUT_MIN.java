
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_GLUT_MIN extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_GLUT_MIN _instance = new MDC_MUSC_LOEXT_GLUT_MIN("MDC_MUSC_LOEXT_GLUT_MIN", 804, 7);

  private MDC_MUSC_LOEXT_GLUT_MIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_GLUT_MIN get() {
    return _instance;
  }
}
