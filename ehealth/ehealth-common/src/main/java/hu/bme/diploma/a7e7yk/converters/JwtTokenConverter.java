package hu.bme.diploma.a7e7yk.converters;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.dtos.WebUserDto;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;

import org.jose4j.jwe.JsonWebEncryption;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.NumericDate;
import org.jose4j.lang.JoseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JwtTokenConverter {

  private static final Logger logger = LoggerFactory.getLogger(JwtTokenConverter.class);

  /**
   * Creates the String representation of the Jwt token.
   * 
   * @param webUserDto user to assign the token.
   * @return
   * @throws JoseException
   */
  public static String createJwtToken(WebUserDto webUserDto) throws JoseException {
    JwtClaims claims = new JwtClaims();
    claims.setIssuer("Cdog corporation");
    claims.setAudience("Audience");
    claims.setExpirationTimeMinutesInTheFuture(EhealthConstants.JWT_EXPIRATION_TIME);
    claims.setGeneratedJwtId();
    claims.setIssuedAtToNow();
    claims.setSubject(webUserDto.getUserId());

    JsonWebEncryption jwe = new JsonWebEncryption();
    jwe.setPayload(claims.toJson());
    jwe.setAlgorithmHeaderValue(EhealthConstants.JWT_KEY_MANAGEMENT_ALGORITHM);
    jwe.setEncryptionMethodHeaderParameter(EhealthConstants.JWT_CONTENT_ENCRYPTION_ALGORITHM);
    jwe.setKey(EhealthConstants.JWT_KEY);

    return jwe.getCompactSerialization();
  }

  /**
   * Returns the {@link JwtClaims#getSubject()} value. If the Token is not valid returns null.
   * 
   * @param jwtToken jwtToken to parse and validate.
   * @return
   * @throws EhealthException JwtToken is invalid
   */
  public static Object validateJwtToken(String jwtToken) throws EhealthException {
    JsonWebEncryption jwe = new JsonWebEncryption();
    jwe.setKey(EhealthConstants.JWT_KEY);
    try {
      jwe.setCompactSerialization(jwtToken);
      JwtClaims claims = JwtClaims.parse(jwe.getPayload());

      if (claims.getExpirationTime().isBefore(NumericDate.now())) {
        throw new EhealthException("Token is not valid");
      }
      return claims.getSubject();
    } catch (Exception e) {
      throw new EhealthException(e, "Invalid Jwt token");
    }
  }

}
