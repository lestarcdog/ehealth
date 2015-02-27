package hu.bme.diploma.a7e7yk.ahd.runtime;

import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v26.segment.OBR;
import ca.uhn.hl7v2.model.v26.segment.OBX;
import ca.uhn.hl7v2.model.v26.segment.PID;

public interface IMessageBuilder {
  public OBX provideOBX();

  public PID providePID();

  public OBR provideOBR();

  public Message getMessage();
}
