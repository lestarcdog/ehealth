package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureValue;

public abstract class AbstractVitalSignValue {
  public abstract SnomedConcept getSnomedConcept();

  public abstract NomenclatureValue getMdcMeasurementType();
}
