package nettosphere;

import hu.bme.diploma.a7e7yk.storm.nettosphere.data.CommandDto;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverterTest {

  @Test
  public void test() throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    CommandDto cdto = new CommandDto("subsribe", "jozsi");
    String s = mapper.writeValueAsString(cdto);
    JsonNode n = mapper.readTree(s);
  }

}
