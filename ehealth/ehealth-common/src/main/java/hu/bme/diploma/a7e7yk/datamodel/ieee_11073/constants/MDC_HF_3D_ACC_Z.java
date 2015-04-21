
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_3D_ACC_Z extends MdcNomenclatureValue {

  private static final MDC_HF_3D_ACC_Z _instance = new MDC_HF_3D_ACC_Z("MDC_HF_3D_ACC_Z", 2013, 129);

  private MDC_HF_3D_ACC_Z(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_3D_ACC_Z get() {
    return _instance;
  }
}
