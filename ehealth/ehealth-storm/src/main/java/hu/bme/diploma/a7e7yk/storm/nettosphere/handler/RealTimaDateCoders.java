package hu.bme.diploma.a7e7yk.storm.nettosphere.handler;

import hu.bme.diploma.a7e7yk.storm.nettosphere.data.RealTimeDataDto;

import org.atmosphere.config.managed.Decoder;
import org.atmosphere.config.managed.Encoder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RealTimaDateCoders implements Encoder<RealTimeDataDto, String>,
    Decoder<String, RealTimeDataDto> {

  private final ObjectMapper mapper = new ObjectMapper();

  @Override
  public RealTimeDataDto decode(String s) {
    try {
      return mapper.readValue(s, RealTimeDataDto.class);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String encode(RealTimeDataDto s) {
    try {
      return mapper.writeValueAsString(s);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

}
