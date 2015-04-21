
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_SPINAL_THORAC extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_SPINAL_THORAC _instance = new MDC_MUSC_BACK_SPINAL_THORAC("MDC_MUSC_BACK_SPINAL_THORAC", 480, 7);

  private MDC_MUSC_BACK_SPINAL_THORAC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_SPINAL_THORAC get() {
    return _instance;
  }
}
