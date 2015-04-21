
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_EXTENS_CARP_RADIAL_BREV extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_EXTENS_CARP_RADIAL_BREV _instance = new MDC_MUSC_UPEXT_EXTENS_CARP_RADIAL_BREV("MDC_MUSC_UPEXT_EXTENS_CARP_RADIAL_BREV", 700, 7);

  private MDC_MUSC_UPEXT_EXTENS_CARP_RADIAL_BREV(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_EXTENS_CARP_RADIAL_BREV get() {
    return _instance;
  }
}
