package hu.bme.diploma.a7e7yk.web.controllers;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.converters.JwtTokenConverter;
import hu.bme.diploma.a7e7yk.dtos.CitizenDto;
import hu.bme.diploma.a7e7yk.dtos.WebUserDto;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;
import hu.bme.diploma.a7e7yk.services.UserService;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jose4j.lang.JoseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends BaseController {

  @EJB
  UserService userService;

  @RequestMapping(method = RequestMethod.POST, value = "/login")
  public WebUserDto login(@RequestBody WebUserDto webUserDto, HttpServletRequest request,
      HttpServletResponse response) throws EhealthException {
    if (webUserDto == null || webUserDto.getUserId() == null || webUserDto.getPassword() == null
        || webUserDto.getUserId().trim().isEmpty() || webUserDto.getPassword().trim().isEmpty()) {
      response.setStatus(HttpStatus.UNAUTHORIZED.value());
      return null;
    }

    // get user from database
    WebUserDto retDto = userService.loginUser(webUserDto.getUserId(), webUserDto.getPassword());

    try {
      response.addHeader(EhealthConstants.AUTH_TOKEN_HEADER_NAME,
          JwtTokenConverter.createJwtToken(retDto));
      return retDto;
    } catch (JoseException e) {
      logger.warn("JWT Token parse error", e);
      response.setStatus(HttpStatus.UNAUTHORIZED.value());
    }
    return null;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/getCitizen/{id}")
  public WebUserDto getCitizen(@PathVariable Integer id) throws EhealthException {
    return userService.findUserById(id);
  }

  @RequestMapping(value = "getPatients/{id}")
  public List<CitizenDto> getAllPatients(@PathVariable Integer id) {
    return userService.getAllPatiens(id);
  }
}
