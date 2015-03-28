package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.ieee_11073.NomenclatureConstants;
import hu.bme.diploma.a7e7yk.datamodel.health.ieee_11073.NomenclatureValue;

public class BloodPressureValue {
  private Double systolic;
  private Double diastolic;
  private Double meanArterialPressure;
  private Double pulseRate;

  public static final SnomedConcept SNOMED_CONCEPT = new SnomedConcept("135840009",
      "Blood pressure monitoring");
  public static final NomenclatureValue MDC_VALUE = new NomenclatureValue(
      "MDC_DEV_SPEC_PROFILE_BP", NomenclatureConstants.MDC_DEV_SPEC_PROFILE_BP,
      NomenclatureConstants.MDC_PART_INFRA);

  public Double getSystolic() {
    return systolic;
  }

  public void setSystolic(Double systolic) {
    this.systolic = systolic;
  }

  public Double getDiastolic() {
    return diastolic;
  }

  public void setDiastolic(Double diastolic) {
    this.diastolic = diastolic;
  }

  public Double getMeanArterialPressure() {
    return meanArterialPressure;
  }

  public void setMeanArterialPressure(Double meanArterialPressure) {
    this.meanArterialPressure = meanArterialPressure;
  }

  public Double getPulseRate() {
    return pulseRate;
  }

  public void setPulseRate(Double pulseRate) {
    this.pulseRate = pulseRate;
  }

}
