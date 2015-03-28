package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.ieee_11073.NomenclatureConstants;
import hu.bme.diploma.a7e7yk.datamodel.health.ieee_11073.NomenclatureValue;

public class ActivityMonitorValue {
  private Double speed;
  private Double altitude;
  private Double activePeriod;

  public static final SnomedConcept SNOMED_CONCEPT = new SnomedConcept("308516007",
      "Well adult monitoring call");
  public static final NomenclatureValue MDC_VALUE = new NomenclatureValue(
      "MDC_DEV_SPEC_PROFILE_PULS_OXIM", NomenclatureConstants.MDC_DEV_SPEC_PROFILE_PULS_OXIM,
      NomenclatureConstants.MDC_PART_DIM);

  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public Double getActivePeriod() {
    return activePeriod;
  }

  public void setActivePeriod(Double activePeriod) {
    this.activePeriod = activePeriod;
  }
}
