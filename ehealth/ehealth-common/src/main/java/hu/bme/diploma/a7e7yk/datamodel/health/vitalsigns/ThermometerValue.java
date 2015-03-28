package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.ieee_11073.NomenclatureConstants;
import hu.bme.diploma.a7e7yk.datamodel.health.ieee_11073.NomenclatureValue;

public class ThermometerValue {
  private Double temp;
  public static final SnomedConcept SNOMED_CONCEPT = new SnomedConcept("133879001",
      "Monitoring of patient temperature");
  public static final NomenclatureValue MDC_VALUE = new NomenclatureValue(
      "MDC_DEV_SPEC_PROFILE_TEMP", NomenclatureConstants.MDC_DEV_SPEC_PROFILE_TEMP,
      NomenclatureConstants.MDC_PART_INFRA);

  public Double getTemp() {
    return temp;
  }

  public void setTemp(Double temp) {
    this.temp = temp;
  }

}
