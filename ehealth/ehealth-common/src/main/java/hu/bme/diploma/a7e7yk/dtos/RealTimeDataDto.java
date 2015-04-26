package hu.bme.diploma.a7e7yk.dtos;

import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureConstants;

/**
 * Dto class for measurement data transport via {@link WebSocket} between the client and server.
 *
 */
public class RealTimeDataDto {
  /**
   * Identifier of the patient who emits the measurements data
   */
  private Object subjectId;
  /**
   * MDC Id of the measurement type {@link MdcNomenclatureConstants}
   */
  private Integer mdcMeasurementId;
  /**
   * Time of the measurement in seconds
   */
  private Long time;
  /**
   * Value of the measurements.
   */
  private AbstractVitalSign value;

  public RealTimeDataDto() {}

  public RealTimeDataDto(Integer mdcMeasurementId, Long time) {
    this.mdcMeasurementId = mdcMeasurementId;
    this.time = time;
  }

  public RealTimeDataDto(Integer mdcMeasurementId, Long time, AbstractVitalSign value) {
    this.mdcMeasurementId = mdcMeasurementId;
    this.time = time;
    this.value = value;
  }

  public RealTimeDataDto(Object subjectId, Integer mdcMeasurementId, Long time,
      AbstractVitalSign value) {
    super();
    this.subjectId = subjectId;
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

  public AbstractVitalSign getValue() {
    return value;
  }

  public void setValue(AbstractVitalSign value) {
    this.value = value;
  }

  public Object getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(Object subjectId) {
    this.subjectId = subjectId;
  }

  @Override
  public String toString() {
    return "RealTimeDataDto [subjectId=" + subjectId + ", mdcMeasurementId=" + mdcMeasurementId
        + ", time=" + time + ", value=" + value + "]";
  }
}
