package hu.bme.diploma.a7e7yk.dtos;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type")
@JsonSubTypes(value = {@Type(value = RealtimeMeasurementDto.class),
    @Type(value = RealtimeDecisionDto.class)})
public class AbstractRealtimeDto {

  /**
   * Identifier of the patient who emits the measurements data
   */
  protected String subjectId;

  /**
   * Time in milliseconds
   */
  protected long timeInMillis;

  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  public long getTimeInMillis() {
    return timeInMillis;
  }

  public void setTimeInMillis(long timeInMillis) {
    this.timeInMillis = timeInMillis;
  }
}
