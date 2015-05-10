package hu.bme.diploma.a7e7yk.interfaces.healthrules;

import java.time.ZonedDateTime;

public interface IRealtimeDecision {

  public void notify(Message msg);

  public static class Message {
    private final String message;
    private final ZonedDateTime eventTime;

    public Message(String message, ZonedDateTime eventTime) {
      this.message = message;
      this.eventTime = eventTime;
    }

    public String getMessage() {
      return message;
    }

    public ZonedDateTime getEventTime() {
      return eventTime;
    }
  }
}
