package hu.bme.diploma.a7e7yk.interfaces.healthrules;

import hu.bme.diploma.a7e7yk.datamodel.enums.RealtimeDecisionMessagePriority;
import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;

import java.time.ZonedDateTime;

/**
 * POJO class for indicating decision of the realtime decision support engine. A message and a
 * {@link SnomedConcept} can specify the "diagnosis".
 *
 */
public class RealtimeDecisionMessage {
  private String subjectId;
  private String message;
  private final ZonedDateTime eventTime;
  private final RealtimeDecisionMessagePriority priority;
  private SnomedConcept concept;

  public RealtimeDecisionMessage(ZonedDateTime eventTime, RealtimeDecisionMessagePriority level) {
    this.eventTime = eventTime;
    this.priority = level;
  }

  public String getMessage() {
    return message;
  }

  public ZonedDateTime getEventTime() {
    return eventTime;
  }

  public SnomedConcept getConcept() {
    return concept;
  }

  public void setConcept(SnomedConcept concept) {
    this.concept = concept;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RealtimeDecisionMessagePriority getPriority() {
    return priority;
  }

  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  @Override
  public String toString() {
    return "RealtimeDecisionMessage [subjectId=" + subjectId + ", message=" + message
        + ", eventTime=" + eventTime + ", priority=" + priority + ", concept=" + concept + "]";
  }
}
