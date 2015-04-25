package hu.bme.diploma.a7e7yk.web.controllers;

import hu.bme.diploma.a7e7yk.dao.web.UserDao;
import hu.bme.diploma.a7e7yk.datamodel.entity.WebUser;
import hu.bme.diploma.a7e7yk.dtos.WebUserDto;
import hu.bme.diploma.a7e7yk.web.WebConstants;

import java.util.UUID;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

  @EJB
  UserDao userDao;

  @RequestMapping(method = RequestMethod.POST, value = "/login",
      produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
  public void login(@RequestBody WebUserDto user, HttpServletRequest request,
      HttpServletResponse response) {

    if (user == null || user.getUsername() == null || user.getPassword() == null
        || user.getUsername().trim().isEmpty() || user.getPassword().trim().isEmpty()) {
      response.setStatus(HttpStatus.UNAUTHORIZED.value());
      return;
    }
    // get user from database
    WebUser webUser = userDao.findWebUserByName(user.getUsername());
    if (webUser == null || !user.getPassword().equals(webUser.getPassword())) {
      response.setStatus(HttpStatus.UNAUTHORIZED.value());
      return;
    }
    response.addHeader(WebConstants.AUTH_TOKEN_HEADER_NAME, UUID.randomUUID().toString());
    return;
  }
}
