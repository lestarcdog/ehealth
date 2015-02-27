package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import java.util.List;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public interface IMeasurement {
  public List<OBX> getOBXs() throws DataTypeException;
}
