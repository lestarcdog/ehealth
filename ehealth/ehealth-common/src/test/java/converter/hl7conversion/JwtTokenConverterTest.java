package converter.hl7conversion;

import hu.bme.diploma.a7e7yk.converters.JwtTokenConverter;
import hu.bme.diploma.a7e7yk.dtos.WebUserDto;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;

import org.jose4j.lang.JoseException;
import org.junit.Assert;
import org.junit.Test;

public class JwtTokenConverterTest {

  @Test
  public void createTokenAndConvertBack() throws EhealthException, JoseException {
    WebUserDto dto = new WebUserDto();
    dto.setUserId("jozsi");
    String token = JwtTokenConverter.createJwtToken(dto);
    String id = (String) JwtTokenConverter.validateJwtToken(token);
    Assert.assertEquals(dto.getUserId(), id);
  }
}
