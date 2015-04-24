package hu.bme.diploma.a7e7yk.web.controllers;

import hu.bme.diploma.a7e7yk.web.dto.UserDto;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController extends BaseController {

  @RequestMapping(value = "/login", produces = MediaType.APPLICATION_JSON)
  public UserDto login() {
    return new UserDto("jozsi", "anyad");
  }
}
