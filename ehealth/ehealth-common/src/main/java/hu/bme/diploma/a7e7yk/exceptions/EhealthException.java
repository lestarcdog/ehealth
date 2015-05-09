package hu.bme.diploma.a7e7yk.exceptions;

public class EhealthException extends Exception {

  private static final long serialVersionUID = 7947583927318961583L;
  private final Throwable sourceException;
  private final String message;

  public EhealthException(Throwable sourceException, String message) {
    this.sourceException = sourceException;
    this.message = message;
  }

  public EhealthException(Throwable sourceException) {
    this.sourceException = sourceException;
    this.message = null;
  }

  public EhealthException(String message) {
    this.sourceException = null;
    this.message = message;
  }

  public Throwable getSourceException() {
    return sourceException;
  }

  public String getMessage() {
    return message;
  }

}
