package hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns;

import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.values.VitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DEV_SPEC_PROFILE_TEMP;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_DIM_DEGC;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants.MDC_TEMP_BODY;

import java.util.Arrays;
import java.util.List;

public class ThermometerVitalSign extends AbstractVitalSign {
  private final VitalSignValue<Double> temp = VitalSignValue.valueOf(MDC_TEMP_BODY.get(), MDC_DIM_DEGC.get());
  public static final SnomedConcept SNOMED_CONCEPT =
      new SnomedConcept("133879001", "Monitoring of patient temperature");
  public static final MdcNomenclatureValue MDC_VALUE = MDC_DEV_SPEC_PROFILE_TEMP.get();

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
    return Arrays.asList(temp);
  }

  public static MdcNomenclatureValue getMdcValue() {
    return MDC_VALUE;
  }

  public VitalSignValue<Double> getTemp() {
    return temp;
  }



}
