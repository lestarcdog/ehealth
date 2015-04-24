package hu.bme.diploma.a7e7yk.exceptions;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class UndefinedMdcTypeException extends EhealthException {
  private static final long serialVersionUID = -773033611705362041L;

  public UndefinedMdcTypeException(MdcNomenclatureValue value) {
    super("Undefined MDC Nomenclature type :" + value.toString());
  }

  public UndefinedMdcTypeException(int valueId) {
    super("Undefined MDC Nomenclature id :" + valueId);
  }
}
