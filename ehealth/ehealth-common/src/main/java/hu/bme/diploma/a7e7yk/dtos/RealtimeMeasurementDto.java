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
  private Integer mdcId;

  /**
   * Value of the measurements.
   */
  private final Map<Integer, Object> values = new HashMap<>();

  public RealtimeMeasurementDto() {}

  public RealtimeMeasurementDto(String ssn, Integer mdcMeasurementId, long time) {
    this.ssn = ssn;
    this.mdcId = mdcMeasurementId;
    this.timeInMillis = time;

  }

  public Integer getMdcId() {
    return mdcId;
  }

  public void setMdcId(Integer mdcMeasurementId) {
    this.mdcId = mdcMeasurementId;
  }

  public Map<Integer, Object> getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "RealtimeMeasurementDto [mdcMeasurementId=" + mdcId + ", values=" + values + "]";
  }


}
