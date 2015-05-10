package hu.bme.diploma.a7e7yk.dtos;

import hu.bme.diploma.a7e7yk.datamodel.enums.RealtimeDecisionMessagePriority;

/**
 * DTO class for web layer contains decision result of the decision support engine.
 * 
 */
public class RealtimeDecisionDto extends AbstractRealtimeDto {
  private String message;
  private RealtimeDecisionMessagePriority priority;

  public RealtimeDecisionDto() {}

  public RealtimeDecisionDto(String message, RealtimeDecisionMessagePriority priority,
      long timeInMillis) {
    this.message = message;
    this.priority = priority;
    this.timeInMillis = timeInMillis;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RealtimeDecisionMessagePriority getPriority() {
    return priority;
  }

  public void setPriority(RealtimeDecisionMessagePriority priority) {
    this.priority = priority;
  }

  @Override
  public String toString() {
    return "RealtimeDecisionDto [message=" + message + ", priority=" + priority + "]";
  }

}
