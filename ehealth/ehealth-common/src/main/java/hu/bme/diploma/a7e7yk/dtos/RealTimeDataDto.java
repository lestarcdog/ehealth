package hu.bme.diploma.a7e7yk.dtos;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureConstants;

import java.util.HashMap;
import java.util.Map;

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
  private final Map<Integer, Object> values = new HashMap<>();

  public RealTimeDataDto() {}

  public RealTimeDataDto(Object subjectId, Integer mdcMeasurementId, Long time) {
    this.subjectId = subjectId;
    this.mdcMeasurementId = mdcMeasurementId;
    this.time = time;

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

  public Object getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(Object subjectId) {
    this.subjectId = subjectId;
  }

  public Map<Integer, Object> getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "RealTimeDataDto [subjectId=" + subjectId + ", mdcMeasurementId=" + mdcMeasurementId + ", time=" + time
        + ", values=" + values + "]";
  }


}
