package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.values.VitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * Abstract class of health vital signs
 */
public abstract class AbstractVitalSign {
  private ZonedDateTime measurementTime;

  public abstract SnomedConcept getSnomedConcept();

  public abstract MdcNomenclatureValue getMdcMeasurementType();

  public abstract List<VitalSignValue<Double>> getAllDoubleVitalSignValues();

  public ZonedDateTime getMeasurementTime() {
    return measurementTime;
  }

  public void setMeasurementTime(ZonedDateTime measurementTime) {
    this.measurementTime = measurementTime;
  }

  @Override
  public String toString() {
    return "AbstractVitalSign [getMdcMeasurementType()=" + getMdcMeasurementType() + ", getMeasurementTime()="
        + getMeasurementTime() + "]";
  }
}
