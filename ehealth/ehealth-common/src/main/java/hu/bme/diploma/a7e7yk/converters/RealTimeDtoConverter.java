package hu.bme.diploma.a7e7yk.converters;

import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.dtos.RealTimeDataDto;

public class RealTimeDtoConverter {
  private RealTimeDtoConverter() {}

  public static RealTimeDataDto convert(AbstractVitalSign value, String userId) {
    RealTimeDataDto dto =
        new RealTimeDataDto(userId, value.getMdcMeasurementType().getId(), value.getMeasurementTime().toInstant()
            .toEpochMilli());
    value.getAllDoubleVitalSignValues().stream().forEach(v -> dto.getValues().put(v.getType().getId(), v.getValue()));
    return dto;
  }
}
