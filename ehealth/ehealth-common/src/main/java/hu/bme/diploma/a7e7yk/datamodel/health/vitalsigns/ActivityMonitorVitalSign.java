package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.values.VitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_ATTR_TIME_PD_MSMT_ACTIVE;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DEV_SPEC_PROFILE_PULS_OXIM;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DIM_MIN;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DIM_TICK;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DIM_X_M;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_HF_ALT;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_HF_SPEED;

import java.util.Arrays;
import java.util.List;

public class ActivityMonitorVitalSign extends AbstractVitalSign {
  private final VitalSignValue<Double> speed = VitalSignValue.valueOf(MDC_HF_SPEED.get(), MDC_DIM_MIN.get());

  private final VitalSignValue<Double> altitude = VitalSignValue.valueOf(MDC_HF_ALT.get(), MDC_DIM_X_M.get());

  private final VitalSignValue<Double> activePeriod = VitalSignValue.valueOf(MDC_ATTR_TIME_PD_MSMT_ACTIVE.get(),
      MDC_DIM_TICK.get());

  public static final SnomedConcept SNOMED_CONCEPT = new SnomedConcept("308516007", "Well adult monitoring call");
  public static final MdcNomenclatureValue MDC_VALUE = MDC_DEV_SPEC_PROFILE_PULS_OXIM.get();
  public static final int MDC_VALUE_ID = MDC_VALUE.getId();


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
    return Arrays.asList(speed, altitude, activePeriod);
  }

  public VitalSignValue<Double> getSpeed() {
    return speed;
  }

  public VitalSignValue<Double> getAltitude() {
    return altitude;
  }

  public VitalSignValue<Double> getActivePeriod() {
    return activePeriod;
  }



}
