package converter.hl7conversion;

import hu.bme.diploma.a7e7yk.converter.RealTimeDtoConverter;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureValue;

import java.time.ZonedDateTime;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class RealTimeDtoConverterTest {

  @Test
  public void conversion() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    BloodPressureValue v = new BloodPressureValue();
    v.setMeasurementTime(ZonedDateTime.now());
    v.setDiastolic(120.0);
    v.setSystolic(110.5);
    v.setPulseRate(75.8);
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    AbstractVitalSignValue vv = v;
    System.out.println(mapper.writeValueAsString(RealTimeDtoConverter.convert(vv)));
  }
}
