package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import ca.uhn.hl7v2.model.DataTypeException;

public class GlucoseMeasurement extends AbstractMeasurement {

  public GlucoseMeasurement() {
    super(new SnomedConcept("359772000", "Glucose monitoring at home"));
  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    // TODO Auto-generated method stub
  }



}
