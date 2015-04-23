package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.values.VitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DEV_SPEC_PROFILE_SCALE;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DIM_CENTI_M;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DIM_KILO_G;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_LEN_BODY_ACTUAL;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_MASS_BODY_ACTUAL;

public class WeightScaleVitalSign extends AbstractVitalSign {
  private final VitalSignValue<Double> weight = VitalSignValue
      .valueOf(MDC_MASS_BODY_ACTUAL.get(), MDC_DIM_KILO_G.get());
  private final VitalSignValue<Double> height = VitalSignValue
      .valueOf(MDC_LEN_BODY_ACTUAL.get(), MDC_DIM_CENTI_M.get());

  public static final SnomedConcept SNOMED_CONCEPT = new SnomedConcept("307818003", "Weight monitoring");
  public static final MdcNomenclatureValue MDC_VALUE = MDC_DEV_SPEC_PROFILE_SCALE.get();

  @Override
  public SnomedConcept getSnomedConcept() {
    return SNOMED_CONCEPT;
  }

  @Override
  public MdcNomenclatureValue getMdcMeasurementType() {
    return MDC_VALUE;
  }

  public VitalSignValue<Double> getWeight() {
    return weight;
  }

  public VitalSignValue<Double> getHeight() {
    return height;
  }

}
