package converter.hl7conversion;

import hu.bme.diploma.a7e7yk.converters.JwtTokenConverter;
import hu.bme.diploma.a7e7yk.dtos.WebUserDto;

import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.lang.JoseException;
import org.junit.Assert;
import org.junit.Test;

public class JwtTokenConverterTest {

  @Test
  public void createToken() throws JoseException, InvalidJwtException {
    WebUserDto dto = new WebUserDto();
    dto.setUsername("jozsi");
    String s = JwtTokenConverter.createJwtToken(dto);
    String id = (String) JwtTokenConverter.validateJwtToken(s);
    Assert.assertEquals("jozsi", id);

  }


}
