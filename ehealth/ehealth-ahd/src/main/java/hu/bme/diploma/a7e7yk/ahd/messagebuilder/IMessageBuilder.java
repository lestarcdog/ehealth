package hu.bme.diploma.a7e7yk.ahd.messagebuilder;

import hu.bme.diploma.a7e7yk.datamodel.ahd.AHDModel;
import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v26.segment.MSH;
import ca.uhn.hl7v2.model.v26.segment.OBR;
import ca.uhn.hl7v2.model.v26.segment.OBX;
import ca.uhn.hl7v2.model.v26.segment.PID;

public interface IMessageBuilder {
  public OBX provideOBX() throws DataTypeException;

  public PID providePID() throws DataTypeException;

  public OBR provideOBR() throws DataTypeException;

  public Message getHL7Message() throws DataTypeException;

  public MSH provideMSH() throws DataTypeException;

  public AHDModel getAhdModel();

  public PersonModel getPersonModel();
}
