package hu.bme.diploma.a7e7yk.datamodel.health.values;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

/**
 * Contains the measurement value and their MDC ieee_11703 metadata
 *
 * @param <T> Type of the measuremtn e.g Double or String
 */
public class VitalSignValue<T> {
  private T value;
  private final MdcNomenclatureValue type;
  private final MdcNomenclatureValue unit;

  private VitalSignValue(MdcNomenclatureValue type, MdcNomenclatureValue unit) {
    this.type = type;
    this.unit = unit;
  }

  private VitalSignValue(T value, MdcNomenclatureValue type, MdcNomenclatureValue unit) {
    this.value = value;
    this.type = type;
    this.unit = unit;
  }

  public static <T> VitalSignValue<T> valueOf(MdcNomenclatureValue type, MdcNomenclatureValue unit) {
    return new VitalSignValue<T>(type, unit);
  }

  public static <T> VitalSignValue<T> valueOf(T value, MdcNomenclatureValue type, MdcNomenclatureValue unit) {
    return new VitalSignValue<T>(value, type, unit);
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public MdcNomenclatureValue getType() {
    return type;
  }

  public MdcNomenclatureValue getUnit() {
    return unit;
  }


}
