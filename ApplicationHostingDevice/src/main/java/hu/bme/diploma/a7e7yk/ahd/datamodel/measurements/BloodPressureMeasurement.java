package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import hu.bme.diploma.a7e7yk.ahd.runtime.IMessageBuilder;

import java.util.List;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class BloodPressureMeasurement extends AbstractMeasurement {

  public BloodPressureMeasurement(IMessageBuilder builder, String majorGroup) {
    super(new SnomedConcept("135840009", "Blood pressure monitoring "), builder, majorGroup);
    // TODO Auto-generated constructor stub
  }

  @Override
  protected List<OBX> getMeasurementOBXs() throws DataTypeException {
    return null;
  }
}
