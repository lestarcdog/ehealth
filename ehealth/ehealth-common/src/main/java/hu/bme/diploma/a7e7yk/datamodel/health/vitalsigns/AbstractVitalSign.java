package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

import java.time.ZonedDateTime;

/**
 * Abstract class of health vital signs
 */
public abstract class AbstractVitalSign {
  private ZonedDateTime measurementTime;

  public abstract SnomedConcept getSnomedConcept();

  public abstract MdcNomenclatureValue getMdcMeasurementType();

  public ZonedDateTime getMeasurementTime() {
    return measurementTime;
  }

  public void setMeasurementTime(ZonedDateTime measurementTime) {
    this.measurementTime = measurementTime;
  }
}
