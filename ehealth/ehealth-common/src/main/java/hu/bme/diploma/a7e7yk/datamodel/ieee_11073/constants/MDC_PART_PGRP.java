
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_PGRP extends MdcNomenclatureValue {

  private static final MDC_PART_PGRP _instance = new MDC_PART_PGRP("MDC_PART_PGRP", 6, 0);

  private MDC_PART_PGRP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_PGRP get() {
    return _instance;
  }
}
