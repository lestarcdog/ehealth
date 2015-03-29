package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureConstants;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureValue;

public class WeightScaleValue extends AbstractVitalSignValue {
  private Double weight;
  private Double height;

  public static final SnomedConcept SNOMED_CONCEPT = new SnomedConcept("307818003",
      "Weight monitoring");
  public static final NomenclatureValue MDC_VALUE = new NomenclatureValue(
      "MDC_DEV_SPEC_PROFILE_SCALE", NomenclatureConstants.MDC_DEV_SPEC_PROFILE_SCALE,
      NomenclatureConstants.MDC_PART_INFRA);

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
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
