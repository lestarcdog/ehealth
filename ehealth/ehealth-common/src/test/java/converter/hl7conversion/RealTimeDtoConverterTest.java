package converter.hl7conversion;

import hu.bme.diploma.a7e7yk.converters.RealTimeDtoConverter;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.dtos.CommandDto;

import java.time.ZonedDateTime;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class RealTimeDtoConverterTest {

  @Test
  public void conversion() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    BloodPressureVitalSign v = new BloodPressureVitalSign();
    v.setMeasurementTime(ZonedDateTime.now());
    v.getDiastolic().setValue(120.0);
    v.getSystolic().setValue(110.5);
    v.getPulseRate().setValue(75.8);
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    AbstractVitalSign vv = v;
    System.out.println(mapper.writeValueAsString(RealTimeDtoConverter.convert(vv)));
  }

  @Test
  public void commandDto() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    CommandDto cmd = new CommandDto(CommandDto.Commands.SUBSCRIBE, "patient1");
    String s = mapper.writeValueAsString(cmd);
    System.out.println(s);
  }
}
