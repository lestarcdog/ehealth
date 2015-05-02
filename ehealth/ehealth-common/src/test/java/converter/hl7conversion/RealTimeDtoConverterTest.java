package converter.hl7conversion;

import hu.bme.diploma.a7e7yk.converters.RealTimeDtoConverter;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.dtos.RealTimeDataDto;

import java.time.ZonedDateTime;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class RealTimeDtoConverterTest {

  @Test
  public void conversion() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    String userId = "jozsi";
    BloodPressureVitalSign v = new BloodPressureVitalSign();
    v.setMeasurementTime(ZonedDateTime.now());
    v.getDiastolic().setValue(120.0);
    v.getSystolic().setValue(110.5);
    v.getPulseRate().setValue(75.8);
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    RealTimeDataDto dto = RealTimeDtoConverter.convert(v, userId);
    System.out.println(mapper.writeValueAsString(dto));

    Assert.assertEquals(userId, dto.getSubjectId());
    Assert.assertEquals(3, dto.getValues().size());
  }
}
