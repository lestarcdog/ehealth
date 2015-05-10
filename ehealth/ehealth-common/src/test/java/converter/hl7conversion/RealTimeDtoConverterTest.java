package converter.hl7conversion;

import hu.bme.diploma.a7e7yk.converters.RealTimeDtoConverter;
import hu.bme.diploma.a7e7yk.datamodel.enums.RealtimeDecisionMessagePriority;
import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.dtos.RealtimeDecisionDto;
import hu.bme.diploma.a7e7yk.dtos.RealtimeMeasurementDto;
import hu.bme.diploma.a7e7yk.interfaces.healthrules.RealtimeDecisionMessage;

import java.time.ZonedDateTime;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class RealTimeDtoConverterTest {

  @Test
  public void converMeasurement() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    String userId = "jozsi";
    BloodPressureVitalSign v = new BloodPressureVitalSign();
    v.setMeasurementTime(ZonedDateTime.now());
    v.getDiastolic().setValue(120.0);
    v.getSystolic().setValue(110.5);
    v.getPulseRate().setValue(75.8);
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    RealtimeMeasurementDto dto = RealTimeDtoConverter.convert2Measurement(v, userId);
    System.out.println(mapper.writeValueAsString(dto));

    Assert.assertEquals(userId, dto.getSubjectId());
    Assert.assertEquals(3, dto.getValues().size());
  }

  @Test
  public void convertDecision() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    RealtimeDecisionMessage msg =
        new RealtimeDecisionMessage(ZonedDateTime.now(), RealtimeDecisionMessagePriority.HIGH);
    msg.setMessage("this is serious shit");
    msg.setSubjectId("jozsi");
    msg.setConcept(new SnomedConcept("123456", "Noname"));

    RealtimeDecisionDto dto = RealTimeDtoConverter.convert2Decision(msg);
    System.out.println(mapper.writeValueAsString(dto));

    Assert.assertEquals(RealtimeDecisionMessagePriority.HIGH.name(), dto.getPriority().name());
    Assert.assertEquals("jozsi", dto.getSubjectId());
    Assert.assertEquals(msg.getMessage(), dto.getMessage());

  }
}
