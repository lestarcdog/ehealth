package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureValue;

import java.time.ZonedDateTime;

public abstract class AbstractVitalSignValue {
  private ZonedDateTime measurementTime;

  public abstract SnomedConcept getSnomedConcept();

  public abstract NomenclatureValue getMdcMeasurementType();

  public ZonedDateTime getMeasurementTime() {
    return measurementTime;
  }

  public void setMeasurementTime(ZonedDateTime measurementTime) {
    this.measurementTime = measurementTime;
  }
}
