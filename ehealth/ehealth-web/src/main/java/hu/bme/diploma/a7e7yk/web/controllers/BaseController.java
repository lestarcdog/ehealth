package hu.bme.diploma.a7e7yk.web.controllers;

import hu.bme.diploma.a7e7yk.exceptions.EhealthException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class BaseController {
  protected static final Logger logger = LoggerFactory.getLogger(BaseController.class);

  @ExceptionHandler(value = EhealthException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public String exception(EhealthException exception) {
    return exception.getMessage();
  }
}
