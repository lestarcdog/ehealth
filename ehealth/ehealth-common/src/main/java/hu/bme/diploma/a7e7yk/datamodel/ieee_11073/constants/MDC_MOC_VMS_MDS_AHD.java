
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MOC_VMS_MDS_AHD extends MdcNomenclatureValue {

  private static final MDC_MOC_VMS_MDS_AHD _instance = new MDC_MOC_VMS_MDS_AHD("MDC_MOC_VMS_MDS_AHD", 7693, 8);

  private MDC_MOC_VMS_MDS_AHD(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MOC_VMS_MDS_AHD get() {
    return _instance;
  }
}
