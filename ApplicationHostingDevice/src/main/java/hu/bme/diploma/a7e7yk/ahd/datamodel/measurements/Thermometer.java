package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import ca.uhn.hl7v2.model.DataTypeException;

public class Thermometer extends AbstractMeasurement {

  public Thermometer(String majorGroup) {
    super(new SnomedConcept("133879001", "Monitoring of patient temperature "), majorGroup);

  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    // TODO Auto-generated method stub
  }
}
