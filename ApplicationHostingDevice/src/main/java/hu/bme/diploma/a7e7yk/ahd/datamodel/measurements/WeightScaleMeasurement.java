package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import ca.uhn.hl7v2.model.DataTypeException;

public class WeightScaleMeasurement extends AbstractMeasurement {
  public WeightScaleMeasurement() {
    super(new SnomedConcept("307818003", "Weight monitoring"));
  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    // TODO Auto-generated method stub
  }


}
