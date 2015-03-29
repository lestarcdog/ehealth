package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureConstants;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureValue;

public class PulseOxyMeterValue extends AbstractVitalSignValue {
  private Double spo2;
  private Double spo2Accuracy;
  private String measurementStatus;
  private Double pulseRate;
  private Double pulsatileQuality;

  public static final SnomedConcept SNOMED_CONCEPT = new SnomedConcept("284034009",
      "Pulse oximetry monitoring");
  public static final NomenclatureValue MDC_VALUE = new NomenclatureValue(
      "MDC_DEV_SPEC_PROFILE_PULS_OXIM", NomenclatureConstants.MDC_DEV_SPEC_PROFILE_PULS_OXIM,
      NomenclatureConstants.MDC_PART_INFRA);

  public Double getSpo2() {
    return spo2;
  }

  public void setSpo2(Double spo2) {
    this.spo2 = spo2;
  }

  public Double getSpo2Accuracy() {
    return spo2Accuracy;
  }

  public void setSpo2Accuracy(Double spo2Accuracy) {
    this.spo2Accuracy = spo2Accuracy;
  }

  public String getMeasurementStatus() {
    return measurementStatus;
  }

  public void setMeasurementStatus(String measurementStatus) {
    this.measurementStatus = measurementStatus;
  }

  public Double getPulseRate() {
    return pulseRate;
  }

  public void setPulseRate(Double pulseRate) {
    this.pulseRate = pulseRate;
  }

  public Double getPulsatileQuality() {
    return pulsatileQuality;
  }

  public void setPulsatileQuality(Double pulsatileQuality) {
    this.pulsatileQuality = pulsatileQuality;
  }

  @Override
  public SnomedConcept getSnomedConcept() {
    return SNOMED_CONCEPT;
  }

  @Override
  public NomenclatureValue getMdcMeasurementType() {
    return MDC_VALUE;
  }

}
