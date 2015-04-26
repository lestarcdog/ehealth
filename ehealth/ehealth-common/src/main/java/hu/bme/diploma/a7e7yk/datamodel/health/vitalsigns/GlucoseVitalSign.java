package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.values.VitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DEV_SPEC_PROFILE_GLUCOSE;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DIM_MILLI_G_PER_DL;

import java.util.Arrays;
import java.util.List;

public class GlucoseVitalSign extends AbstractVitalSign {
  private final VitalSignValue<Double> glucose = VitalSignValue.valueOf(MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD.get(),
      MDC_DIM_MILLI_G_PER_DL.get());
  public static final SnomedConcept SNOMED_CONCEPT = new SnomedConcept("359772000", "Glucose monitoring at home");
  public static final MdcNomenclatureValue MDC_VALUE = MDC_DEV_SPEC_PROFILE_GLUCOSE.get();

  @Override
  public List<VitalSignValue<Double>> getAllDoubleVitalSignValues() {
    return Arrays.asList(glucose);
  }

  @Override
  public SnomedConcept getSnomedConcept() {
    return SNOMED_CONCEPT;
  }

  @Override
  public MdcNomenclatureValue getMdcMeasurementType() {
    return MDC_VALUE;
  }

  public VitalSignValue<Double> getGlucose() {
    return glucose;
  }



}
