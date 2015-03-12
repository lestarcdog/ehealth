package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.helper.MeasurementHelper;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class BloodPressureMeasurement extends AbstractMeasurement {
  private Double systolic;
  private Double diastolic;
  private Double meanArterialPressure;
  private Double pulseRate;


  public BloodPressureMeasurement() {
    super(new SnomedConcept("135840009", "Blood pressure monitoring "));
  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    OBX obx;
    obx = builder.provideOBX();
    // MDS
    MeasurementHelper.initObxSegment(obx, "X", this.timeModel.getMeasurementTime());
    // 528391^MDC_DEV_SPEC_PROFILE_BP^MDC
    MeasurementHelper.setObxField3ObservationId(obx, "528391^MDC_DEV_SPEC_PROFILE_BP^MDC");
    obx.getObx4_ObservationSubID().setValue(this.getObservationalId().getFirstGroup());
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi1_EntityIdentifier().setValue("0123456789ABCDEF");
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi2_NamespaceID().setValue("EUI-64");

    // Systolic/Diastolic/MAP
    obx = builder.provideOBX();
    // 150020^MDC_PRESS_BLD_NONINV^MDC
    MeasurementHelper.initObxSegment(obx, "x", this.timeModel.getMeasurementTime());
    obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextThirdId());
    MeasurementHelper.setObxField3ObservationId(obx, "150020", "MDC_PRESS_BLD_NONINV", "MDC");

    if (systolic != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.timeModel.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      // 150021^MDC_PRESS_BLD_NONINV_SYS^MDC
      MeasurementHelper.setObxField3ObservationId(obx, "150021", "MDC_PRESS_BLD_NONINV_SYS", "MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeVale(obx, builder.getHL7Message(), systolic);
      // 266016^MDC_DIM_MMHG^MDC
      MeasurementHelper.setObxField6Unit(obx, "266016", "MDC_DIM_MMHG", "MDC");
    }

    if (diastolic != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.timeModel.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      // 150022^MDC_PRESS_BLD_NONINV_DIA^MDC
      MeasurementHelper.setObxField3ObservationId(obx, "150022^MDC_PRESS_BLD_NONINV_DIA^MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeVale(obx, builder.getHL7Message(), diastolic);
      // 266016^MDC_DIM_MMHG^MDC
      MeasurementHelper.setObxField6Unit(obx, "266016^MDC_DIM_MMHG^MDC");

    }

    if (pulseRate != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.timeModel.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      MeasurementHelper.setObxField3ObservationId(obx, "149546^MDC_PULS_RATE_NON_INV^MDC");
      getObservationalId().restartCounters();
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeVale(obx, builder.getHL7Message(), pulseRate);
      // 266016^MDC_DIM_MMHG^MDC
      MeasurementHelper.setObxField6Unit(obx, "264864^MDC_DIM_BEAT_PER_MIN^MDC");
    }



  }

  // === getter / setters ====
  public Double getSystolic() {
    return systolic;
  }

  public void setSystolic(Double systolic) {
    this.systolic = systolic;
  }

  public Double getDiastolic() {
    return diastolic;
  }

  public void setDiastolic(Double diastolic) {
    this.diastolic = diastolic;
  }

  public Double getMeanArterialPressure() {
    return meanArterialPressure;
  }

  public void setMeanArterialPressure(Double meanArterialPressure) {
    this.meanArterialPressure = meanArterialPressure;
  }

  public Double getPulseRate() {
    return pulseRate;
  }

  public void setPulseRate(Double pulseRate) {
    this.pulseRate = pulseRate;
  }
}
