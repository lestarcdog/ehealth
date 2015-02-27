package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import ca.uhn.hl7v2.model.DataTypeException;

public class BloodPressureMeasurement extends AbstractMeasurement {

  public BloodPressureMeasurement(String majorGroup) {
    super(new SnomedConcept("135840009", "Blood pressure monitoring "), majorGroup);
    // TODO Auto-generated constructor stub
  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    // TODO Auto-generated method stub

  }


}
