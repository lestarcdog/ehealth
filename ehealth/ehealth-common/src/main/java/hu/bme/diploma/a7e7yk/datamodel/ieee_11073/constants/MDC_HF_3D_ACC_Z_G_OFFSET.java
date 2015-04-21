
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_3D_ACC_Z_G_OFFSET extends MdcNomenclatureValue {

  private static final MDC_HF_3D_ACC_Z_G_OFFSET _instance = new MDC_HF_3D_ACC_Z_G_OFFSET("MDC_HF_3D_ACC_Z_G_OFFSET", 2014, 129);

  private MDC_HF_3D_ACC_Z_G_OFFSET(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_3D_ACC_Z_G_OFFSET get() {
    return _instance;
  }
}
