package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import hu.bme.diploma.a7e7yk.ahd.runtime.IMessageBuilder;

import java.util.List;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class Thermometer extends AbstractMeasurement {

  public Thermometer(IMessageBuilder builder, String majorGroup) {
    super(new SnomedConcept("133879001", "Monitoring of patient temperature "), builder, majorGroup);

  }

  @Override
  protected List<OBX> getMeasurementOBXs() throws DataTypeException {
    // TODO Auto-generated method stub
    return null;
  }
}
