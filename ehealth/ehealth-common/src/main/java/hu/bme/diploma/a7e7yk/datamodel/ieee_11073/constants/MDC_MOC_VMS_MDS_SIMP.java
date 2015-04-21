
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MOC_VMS_MDS_SIMP extends MdcNomenclatureValue {

  private static final MDC_MOC_VMS_MDS_SIMP _instance = new MDC_MOC_VMS_MDS_SIMP("MDC_MOC_VMS_MDS_SIMP", 37, 1);

  private MDC_MOC_VMS_MDS_SIMP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MOC_VMS_MDS_SIMP get() {
    return _instance;
  }
}
