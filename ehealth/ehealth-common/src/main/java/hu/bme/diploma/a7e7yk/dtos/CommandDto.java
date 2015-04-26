package hu.bme.diploma.a7e7yk.dtos;

public class CommandDto {
  private Commands command;
  private String value;


  public CommandDto() {}

  public CommandDto(Commands command, String value) {
    this.command = command;
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public Commands getCommand() {
    return command;
  }

  public void setCommand(Commands command) {
    this.command = command;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CommandDto [command=" + command + ", value=" + value + "]";
  }

  public static enum Commands {
    SUBSCRIBE, UNSUBSCRIBE;
  }



}
