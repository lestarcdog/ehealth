package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.interfaces;

import ca.uhn.hl7v2.model.DataTypeException;

public interface IMeasurement {
  public static String asdf = "anyad";

  public void generateMessage() throws DataTypeException;
}
