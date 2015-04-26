package hu.bme.diploma.a7e7yk.converters;

import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.dtos.RealTimeDataDto;

public class RealTimeDtoConverter {
  private RealTimeDtoConverter() {}

  public static RealTimeDataDto convert(AbstractVitalSign value) {
    RealTimeDataDto dto =
        new RealTimeDataDto(value.getMdcMeasurementType().getId(), value.getMeasurementTime()
            .toInstant().toEpochMilli(), value);
    return dto;
  }

  public static RealTimeDataDto convert(AbstractVitalSign value, String userId) {
    RealTimeDataDto dto =
        new RealTimeDataDto(value.getMdcMeasurementType().getId(), value.getMeasurementTime()
            .toInstant().toEpochMilli(), value);
    dto.setSubjectId(userId);
    return dto;
  }
}
