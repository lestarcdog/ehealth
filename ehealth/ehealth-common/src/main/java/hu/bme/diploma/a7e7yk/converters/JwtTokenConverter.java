package hu.bme.diploma.a7e7yk.converters;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.dtos.WebUserDto;

import org.jose4j.jwe.JsonWebEncryption;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.NumericDate;
import org.jose4j.lang.JoseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JwtTokenConverter {

  private static final Logger logger = LoggerFactory.getLogger(JwtTokenConverter.class);

  public static String createJwtToken(WebUserDto webUserDto) throws JoseException {
    JwtClaims claims = new JwtClaims();
    claims.setIssuer("Cdog corporation");
    claims.setAudience("Audience");
    claims.setExpirationTimeMinutesInTheFuture(EhealthConstants.JWT_EXPIRATION_TIME);
    claims.setGeneratedJwtId();
    claims.setIssuedAtToNow();
    claims.setNotBeforeMinutesInThePast(2);
    claims.setSubject(webUserDto.getUsername());

    JsonWebEncryption jwe = new JsonWebEncryption();
    jwe.setPayload(claims.toJson());
    jwe.setAlgorithmHeaderValue(EhealthConstants.JWT_KEY_MANAGEMENT_ALGORITHM);
    jwe.setEncryptionMethodHeaderParameter(EhealthConstants.JWT_CONTENT_ENCRYPTION_ALGORITHM);
    jwe.setKey(EhealthConstants.JWT_KEY);

    return jwe.getCompactSerialization();
  }

  public static Object validateJwtToken(String jwtToken) {
    JsonWebEncryption jwe = new JsonWebEncryption();
    jwe.setKey(EhealthConstants.JWT_KEY);
    try {
      jwe.setCompactSerialization(jwtToken);
      JwtClaims claims = JwtClaims.parse(jwe.getPayload());

      if (claims.getNotBefore().isAfter(NumericDate.now())) {
        return null;
      }
      return claims.getSubject();
    } catch (Exception e) {
      logger.warn(null, e);
    }
    return null;
  }

}
