package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.values.VitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DEV_SPEC_PROFILE_BP;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DIM_BEAT_PER_MIN;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DIM_MMHG;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_PRESS_BLD_NONINV_DIA;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_PRESS_BLD_NONINV_SYS;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_PULS_RATE_NON_INV;

import java.util.Arrays;
import java.util.List;

public class BloodPressureVitalSign extends AbstractVitalSign {
  private final VitalSignValue<Double> systolic = VitalSignValue.valueOf(MDC_PRESS_BLD_NONINV_SYS.get(),
      MDC_DIM_MMHG.get());
  private final VitalSignValue<Double> diastolic = VitalSignValue.valueOf(MDC_PRESS_BLD_NONINV_DIA.get(),
      MDC_DIM_MMHG.get());
  private final VitalSignValue<Double> pulseRate = VitalSignValue.valueOf(MDC_PULS_RATE_NON_INV.get(),
      MDC_DIM_BEAT_PER_MIN.get());

  public static final SnomedConcept SNOMED_CONCEPT = new SnomedConcept("135840009", "Blood pressure monitoring");
  public static final MdcNomenclatureValue MDC_VALUE = MDC_DEV_SPEC_PROFILE_BP.get();


  @Override
  public SnomedConcept getSnomedConcept() {
    return SNOMED_CONCEPT;
  }

  @Override
  public MdcNomenclatureValue getMdcMeasurementType() {
    return MDC_VALUE;
  }

  @Override
  public List<VitalSignValue<Double>> getAllDoubleVitalSignValues() {
    return Arrays.asList(systolic, diastolic, pulseRate);
  }

  public VitalSignValue<Double> getSystolic() {
    return systolic;
  }

  public VitalSignValue<Double> getDiastolic() {
    return diastolic;
  }

  public VitalSignValue<Double> getPulseRate() {
    return pulseRate;
  }



}
