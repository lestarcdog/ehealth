package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureConstants;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureValue;

public class GlucoseValue extends AbstractVitalSignValue {
  private Double glucose;
  public static final SnomedConcept SNOMED_CONCEPT = new SnomedConcept("359772000",
      "Glucose monitoring at home");
  public static final NomenclatureValue MDC_VALUE = new NomenclatureValue(
      "MDC_DEV_SPEC_PROFILE_GLUCOSE", NomenclatureConstants.MDC_DEV_SPEC_PROFILE_GLUCOSE,
      NomenclatureConstants.MDC_PART_INFRA);

  public Double getGlucose() {
    return glucose;
  }

  public void setGlucose(Double glucose) {
    this.glucose = glucose;
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
