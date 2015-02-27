package hu.bme.diploma.a7e7yk.ahd.runtime;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v26.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;
import ca.uhn.hl7v2.model.v26.segment.OBR;
import ca.uhn.hl7v2.model.v26.segment.OBX;
import ca.uhn.hl7v2.model.v26.segment.PID;

public class PCD_01MessageBuilder implements IMessageBuilder {
  private static final Logger _l = LoggerFactory.getLogger(PCD_01MessageBuilder.class);
  private final ORU_R01 msg;
  private final ORU_R01_ORDER_OBSERVATION orderObservation;
  private int orbId;
  private int segmentId;
  private int obxIdx;
  private int majorGroup;

  public PCD_01MessageBuilder(int messagePro) throws HL7Exception, IOException {
    msg = new ORU_R01();
    segmentId = 1;
    obxIdx = 0;
    majorGroup = 1;
    // T (Training) P (Production) D (Debugging)
    msg.initQuickstart("ORU", "R01", "T");
    orderObservation = msg.getPATIENT_RESULT().getORDER_OBSERVATION();
  }

  // Pg. 368
  private void buildMSHSegment() {

  }

  public OBX provideOBX() {
    OBX obx = orderObservation.getOBSERVATION(nextObxId()).getOBX();
    try {
      obx.getObx1_SetIDOBX().setValue(nextSegmentId());
    } catch (DataTypeException e) {
      e.printStackTrace();
      _l.error(null, e);
    }
    return obx;
  }

  public Message getMessage() {
    return msg;
  }

  public PID providePID() {
    PID pid = msg.getPATIENT_RESULT().getPATIENT().getPID();
    try {
      pid.getPid1_SetIDPID().setValue(nextSegmentId());
    } catch (DataTypeException e) {
      e.printStackTrace();
      _l.error(null, e);
    }
    return pid;
  }

  public OBR provideOBR() {
    OBR obr = orderObservation.getOBR();
    try {
      obr.getObr1_SetIDOBR().setValue(nextSegmentId());
    } catch (DataTypeException e) {
      e.printStackTrace();
      _l.error(null, e);
    }
    return orderObservation.getOBR();
  }

  private String nextSegmentId() {
    return Integer.toString(++segmentId);
  }

  private int nextOrbId() {
    return ++orbId;
  }

  private int nextObxId() {
    return ++obxIdx;
  }
}
