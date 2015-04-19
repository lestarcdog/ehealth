package hu.bme.diploma.a7e7yk.dto;

import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureConstants;

/**
 * Dto class for measurement data transport via {@link WebSocket} between the client and server.
 *
 */
public class RealTimeDataDto {
  /**
   * MDC Id of the measurement type {@link NomenclatureConstants}
   */
  private Integer mdcMeasurementId;
  /**
   * Time of the measurement in milliseconds
   */
  private Long time;
  /**
   * Value of the measurements.
   */
  private AbstractVitalSignValue value;

  public RealTimeDataDto() {}

  public RealTimeDataDto(Integer mdcMeasurementId, Long time) {
    this.mdcMeasurementId = mdcMeasurementId;
    this.time = time;
  }

  public RealTimeDataDto(Integer mdcMeasurementId, Long time, AbstractVitalSignValue value) {
    this.mdcMeasurementId = mdcMeasurementId;
    this.time = time;
    this.value = value;
  }

  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }


  public Integer getMdcMeasurementId() {
    return mdcMeasurementId;
  }

  public void setMdcMeasurementId(Integer mdcMeasurementId) {
    this.mdcMeasurementId = mdcMeasurementId;
  }

  public AbstractVitalSignValue getValue() {
    return value;
  }

  public void setValue(AbstractVitalSignValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "RealTimeDataDto [mdcMeasurementId=" + mdcMeasurementId + ", time=" + time + ", value="
        + value + "]";
  }
}
