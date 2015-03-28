package hu.bme.diploma.a7e7yk.datamodel.ahd.measurements;

import hu.bme.diploma.a7e7yk.datamodel.ahd.measurements.helper.MeasurementHelper;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureValue;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class BloodPressureMeasurement extends AbstractMeasurement {

  private BloodPressureValue value;


  public BloodPressureMeasurement() {
    super(BloodPressureValue.SNOMED_CONCEPT);
  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    OBX obx;
    obx = builder.provideOBX();
    // MDS
    MeasurementHelper.initObxSegment(obx, "X", this.measurementTime.getMeasurementTime());
    // 528391^MDC_DEV_SPEC_PROFILE_BP^MDC
    MeasurementHelper.setObxField3ObservationId(obx, "528391^MDC_DEV_SPEC_PROFILE_BP^MDC");
    obx.getObx4_ObservationSubID().setValue(this.getObservationalId().getFirstGroup());
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi1_EntityIdentifier()
        .setValue("0123456789ABCDEF");
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi2_NamespaceID().setValue("EUI-64");

    // Systolic/Diastolic/MAP
    obx = builder.provideOBX();
    // 150020^MDC_PRESS_BLD_NONINV^MDC
    MeasurementHelper.initObxSegment(obx, "x", this.measurementTime.getMeasurementTime());
    obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextThirdId());
    MeasurementHelper.setObxField3ObservationId(obx, "150020", "MDC_PRESS_BLD_NONINV", "MDC");

    if (value.getSystolic() != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.measurementTime.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      // 150021^MDC_PRESS_BLD_NONINV_SYS^MDC
      MeasurementHelper.setObxField3ObservationId(obx, "150021", "MDC_PRESS_BLD_NONINV_SYS", "MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeValue(obx, builder.getHL7Message(), value.getSystolic());
      // 266016^MDC_DIM_MMHG^MDC
      MeasurementHelper.setObxField6Unit(obx, "266016", "MDC_DIM_MMHG", "MDC");
    }

    if (value.getDiastolic() != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.measurementTime.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      // 150022^MDC_PRESS_BLD_NONINV_DIA^MDC
      MeasurementHelper.setObxField3ObservationId(obx, "150022^MDC_PRESS_BLD_NONINV_DIA^MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeValue(obx, builder.getHL7Message(), value.getDiastolic());
      // 266016^MDC_DIM_MMHG^MDC
      MeasurementHelper.setObxField6Unit(obx, "266016^MDC_DIM_MMHG^MDC");

    }

    if (value.getPulseRate() != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.measurementTime.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      MeasurementHelper.setObxField3ObservationId(obx, "149546^MDC_PULS_RATE_NON_INV^MDC");
      getObservationalId().restartCounters();
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeValue(obx, builder.getHL7Message(), value.getPulseRate());
      // 266016^MDC_DIM_MMHG^MDC
      MeasurementHelper.setObxField6Unit(obx, "264864^MDC_DIM_BEAT_PER_MIN^MDC");
    }



  }

  public BloodPressureValue getValue() {
    return value;
  }

  public void setValue(BloodPressureValue value) {
    this.value = value;
  }


}
