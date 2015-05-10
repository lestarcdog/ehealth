package hu.bme.diploma.a7e7yk.dtos;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * Dto class for measurement data transport via {@link WebSocket} between the client and server.
 *
 */
public class RealtimeMeasurementDto extends AbstractRealtimeDto {
  /**
   * MDC Id of the measurement type {@link MdcNomenclatureConstants}
   */
  private Integer mdcMeasurementId;

  /**
   * Value of the measurements.
   */
  private final Map<Integer, Object> values = new HashMap<>();

  public RealtimeMeasurementDto() {}

  public RealtimeMeasurementDto(String subjectId, Integer mdcMeasurementId, long time) {
    this.subjectId = subjectId;
    this.mdcMeasurementId = mdcMeasurementId;
    this.timeInMillis = time;

  }

  public Integer getMdcMeasurementId() {
    return mdcMeasurementId;
  }

  public void setMdcMeasurementId(Integer mdcMeasurementId) {
    this.mdcMeasurementId = mdcMeasurementId;
  }

  public Map<Integer, Object> getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "RealtimeMeasurementDto [mdcMeasurementId=" + mdcMeasurementId + ", values=" + values
        + "]";
  }


}
