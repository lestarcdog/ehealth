package converter.hl7conversion;

import hu.bme.diploma.a7e7yk.converters.JwtTokenConverter;
import hu.bme.diploma.a7e7yk.converters.JwtTokenConverter.EHealthJwtClaims;
import hu.bme.diploma.a7e7yk.datamodel.enums.WebUserGroupEnum;
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
    dto.setUserGroup(WebUserGroupEnum.Citizen.name());
    String token = JwtTokenConverter.createJwtToken(dto);
    EHealthJwtClaims claims = JwtTokenConverter.validateJwtToken(token);

    Assert.assertEquals(dto.getUserId(), claims.getSubject());
    Assert.assertEquals(dto.getUserGroup(), claims.getUserGroup().name());
  }
}
