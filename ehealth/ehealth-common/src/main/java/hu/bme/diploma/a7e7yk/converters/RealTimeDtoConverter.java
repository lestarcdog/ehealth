package hu.bme.diploma.a7e7yk.converters;

import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.dtos.RealtimeDecisionDto;
import hu.bme.diploma.a7e7yk.dtos.RealtimeMeasurementDto;
import hu.bme.diploma.a7e7yk.interfaces.healthrules.RealtimeDecisionMessage;

public class RealTimeDtoConverter {
  private RealTimeDtoConverter() {}

  public static RealtimeMeasurementDto convert2Measurement(AbstractVitalSign value, String subjectId) {
    long millis = value.getMeasurementTime().toInstant().toEpochMilli();
    RealtimeMeasurementDto dto = new RealtimeMeasurementDto(subjectId, value.getMdcMeasurementType().getId(), millis);
    value.getAllDoubleVitalSignValues().stream().forEach(v -> dto.getValues().put(v.getType().getId(), v.getValue()));
    return dto;
  }

  public static RealtimeDecisionDto convert2Decision(RealtimeDecisionMessage message) {
    RealtimeDecisionDto dto = new RealtimeDecisionDto();
    dto.setSsn(message.getSubjectId());
    dto.setMessage(message.getMessage());
    dto.setPriority(message.getPriority());
    dto.setTimeInMillis(message.getEventTime().toInstant().toEpochMilli());
    return dto;
  }
}
