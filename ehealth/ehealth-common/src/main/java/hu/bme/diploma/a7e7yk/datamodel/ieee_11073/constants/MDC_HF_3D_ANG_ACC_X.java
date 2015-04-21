
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_3D_ANG_ACC_X extends MdcNomenclatureValue {

  private static final MDC_HF_3D_ANG_ACC_X _instance = new MDC_HF_3D_ANG_ACC_X("MDC_HF_3D_ANG_ACC_X", 2015, 129);

  private MDC_HF_3D_ANG_ACC_X(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_3D_ANG_ACC_X get() {
    return _instance;
  }
}
