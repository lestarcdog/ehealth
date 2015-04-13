package hu.bme.diploma.a7e7yk.ahd.messagebuilder;

import hu.bme.diploma.a7e7yk.ahd.measurements.AbstractMeasurement;
import hu.bme.diploma.a7e7yk.datamodel.ahd.AHDModel;
import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v26.group.ORU_R01_ORDER_OBSERVATION;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;
import ca.uhn.hl7v2.model.v26.segment.MSH;
import ca.uhn.hl7v2.model.v26.segment.OBR;
import ca.uhn.hl7v2.model.v26.segment.OBX;
import ca.uhn.hl7v2.model.v26.segment.PID;

public class PCD_01MessageBuilder implements IMessageBuilder {
  private static final Logger LOG = LoggerFactory.getLogger(PCD_01MessageBuilder.class);
  private int messageControlId = 0;
  private ORU_R01 msg;
  private ORU_R01_ORDER_OBSERVATION orderObservation;
  private int segmentId;
  private int obxId;
  private List<OBX> obxs;
  private String messageControl;
  private final AHDModel ahdModel;
  private final PersonModel personModel;

  public PCD_01MessageBuilder(AHDModel ahdModel, PersonModel personModel) throws HL7Exception,
      IOException {
    this.ahdModel = ahdModel;
    this.personModel = personModel;
    resetBuilder();
  }

  private void resetBuilder() throws HL7Exception, IOException {
    segmentId = 0;
    obxId = 0;
    obxs = new ArrayList<OBX>();
    messageControl = "msgId" + messageControlId++;
    // T (Training) P (Production) D (Debugging)
    msg = new ORU_R01();
    msg.initQuickstart("ORU", "R01", "T");
    orderObservation = msg.getPATIENT_RESULT().getORDER_OBSERVATION();
  }

  public Message generateMessage(AbstractMeasurement measurement) throws DataTypeException {
    measurement.setBuilder(this);
    // generateAHDSegments
    // generateMDSSegment
    measurement.generateMessage();
    return msg;
  }

  @Override
  public MSH provideMSH() throws DataTypeException {
    MSH msh = msg.getMSH();
    msh.getMsh10_MessageControlID().setValue(messageControl);
    return msh;
  }

  @Override
  public OBX provideOBX() throws DataTypeException {
    OBX obx = orderObservation.getOBSERVATION(nextObxId()).getOBX();
    obx.getObx1_SetIDOBX().setValue(nextSegmentId());
    obxs.add(obx);
    return obx;
  }

  @Override
  public PID providePID() {
    PID pid = msg.getPATIENT_RESULT().getPATIENT().getPID();
    return pid;
  }

  @Override
  public OBR provideOBR() throws DataTypeException {
    OBR obr = orderObservation.getOBR();
    obr.getObr1_SetIDOBR().setValue(nextSegmentId());
    return orderObservation.getOBR();
  }

  @Override
  public AHDModel getAhdModel() {
    return ahdModel;
  }

  @Override
  public PersonModel getPersonModel() {
    return personModel;
  }

  private void generateAHDSegments() {
    throw new UnsupportedOperationException();
  }

  private String nextSegmentId() {
    return Integer.toString(++segmentId);
  }

  private int nextObxId() {
    int t = obxId;
    obxId++;
    return t;
  }

  public Message getHL7Message() {
    return msg;
  }
}
