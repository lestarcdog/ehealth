package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.values.VitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DEV_SPEC_PROFILE_PULS_OXIM;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DIM_BEAT_PER_MIN;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DIM_PERCENT;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_PULS_OXIM_PULS_RATE;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_PULS_OXIM_SAT_O2;

import java.util.Arrays;
import java.util.List;

public class PulseOxyMeterVitalSign extends AbstractVitalSign {
  private final VitalSignValue<Double> spo2 = VitalSignValue.valueOf(MDC_PULS_OXIM_SAT_O2.get(), MDC_DIM_PERCENT.get());
  private final VitalSignValue<Double> spo2Accuracy = null;
  private final VitalSignValue<String> measurementStatus = null;
  private final VitalSignValue<Double> pulseRate = VitalSignValue.valueOf(MDC_PULS_OXIM_PULS_RATE.get(),
      MDC_DIM_BEAT_PER_MIN.get());
  private final VitalSignValue<Double> pulsatileQuality = null;

  public static final SnomedConcept SNOMED_CONCEPT = new SnomedConcept("284034009", "Pulse oximetry monitoring");
  public static final MdcNomenclatureValue MDC_VALUE = MDC_DEV_SPEC_PROFILE_PULS_OXIM.get();

  @Override
  public List<VitalSignValue<Double>> getAllDoubleVitalSignValues() {
    return Arrays.asList(spo2, pulseRate);
  }

  @Override
  public SnomedConcept getSnomedConcept() {
    return SNOMED_CONCEPT;
  }

  @Override
  public MdcNomenclatureValue getMdcMeasurementType() {
    return MDC_VALUE;
  }

  public VitalSignValue<Double> getSpo2() {
    return spo2;
  }

  public VitalSignValue<Double> getPulseRate() {
    return pulseRate;
  }

}
