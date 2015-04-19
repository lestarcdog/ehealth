package hu.bme.diploma.a7e7yk.converter;

import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSignValue;
import hu.bme.diploma.a7e7yk.dto.RealTimeDataDto;

public class RealTimeDtoConverter {
  private RealTimeDtoConverter() {}

  public static RealTimeDataDto convert(AbstractVitalSignValue value) {
    RealTimeDataDto dto =
        new RealTimeDataDto(value.getMdcMeasurementType().getValue(), value.getMeasurementTime()
            .toInstant().toEpochMilli(), value);
    dto.getValue().setMeasurementTime(null);
    return dto;

  }
}
