
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_ORBIC_OCUL_PARS_ORBIT extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_ORBIC_OCUL_PARS_ORBIT _instance = new MDC_MUSC_HEAD_ORBIC_OCUL_PARS_ORBIT("MDC_MUSC_HEAD_ORBIC_OCUL_PARS_ORBIT", 296, 7);

  private MDC_MUSC_HEAD_ORBIC_OCUL_PARS_ORBIT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_ORBIC_OCUL_PARS_ORBIT get() {
    return _instance;
  }
}
