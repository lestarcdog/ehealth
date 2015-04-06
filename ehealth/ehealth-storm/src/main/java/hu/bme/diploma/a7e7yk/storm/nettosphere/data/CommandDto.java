package hu.bme.diploma.a7e7yk.storm.nettosphere.data;

public class CommandDto {
  private String command;
  private String value;
  public static final String TYPE = "Command";
  public static final String COMMAND_SUBSCRIBE = "subscribe";
  public static final String COMMAND_UNSUBSCRIBE = "unsubscribe";

  public CommandDto() {

  }

  public CommandDto(String command, String value) {
    this.command = command;
    this.value = value;
  }

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CommandDto [command=" + command + ", value=" + value + "]";
  }


}
