package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.helper.MeasurementHelper;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class ActivityMonitorMeasurement extends AbstractMeasurement {

  private Double speed;
  private Double altitude;
  private Double activePeriod = 5.0;


  public ActivityMonitorMeasurement() {
    super(new SnomedConcept("308516007", "Well adult monitoring call"));
  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    OBX obx = this.builder.provideOBX();
    // 528425^MDC_DEV_SPEC_PROFILE_HF_CARDIO^MDC
    MeasurementHelper.initObxSegment(obx, "X", this.timeModel.getMeasurementTime());
    MeasurementHelper.setObxField3ObservationId(obx, "528425^MDC_DEV_SPEC_PROFILE_HF_CARDIO^MDC");
    obx.getObx4_ObservationSubID().setValue(getObservationalId().getFirstGroup());
    MeasurementHelper.setObxField18EII(obx, "0123456789ABCDEF^EUI-64");
    // Session
    obx = builder.provideOBX();
    MeasurementHelper.initObxSegment(obx, "R", this.timeModel.getMeasurementTime());
    obx.getObx2_ValueType().setValue("CWE");
    obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
    MeasurementHelper.setObxField3ObservationId(obx, "8454267^MDC_HF_SESSION^MDC");
    MeasurementHelper.setObxField5CWETypeValue(obx, this.builder.getHL7Message(),
        "8455151^MDC_HF_ACT_UNKNOWN^MDC");

    // active period
    obx = builder.provideOBX();
    MeasurementHelper.initObxSegment(obx, "R", timeModel.getMeasurementTime());
    obx.getObx2_ValueType().setValue("NM");
    // 68185^MDC_ATTR_TIME_PD_MSMT_ACTIVE^MDC
    MeasurementHelper.setObxField3ObservationId(obx, "68185^MDC_ATTR_TIME_PD_MSMT_ACTIVE^MDC");
    obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFifthId());
    MeasurementHelper.setObxField5NMTypeValue(obx, this.builder.getHL7Message(), activePeriod);
    // 264320^MDC_DIM_SEC^MDC
    MeasurementHelper.setObxField6Unit(obx, "264320^MDC_DIM_SEC^MDC");

    if (speed != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", timeModel.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      MeasurementHelper.setObxField3ObservationId(obx, "8454254^MDC_HF_SPEED^MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeValue(obx, this.builder.getHL7Message(), speed);
      // 264320^MDC_DIM_SEC^MDC
      MeasurementHelper.setObxField6Unit(obx, "268704^MDC_DIM_M_PER_MIN^MDC");
    }

    if (altitude != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", timeModel.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      MeasurementHelper.setObxField3ObservationId(obx, "8454246^MDC_HF_ALT^MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeValue(obx, this.builder.getHL7Message(), altitude);
      // 264320^MDC_DIM_SEC^MDC
      MeasurementHelper.setObxField6Unit(obx, "263424^MDC_DIM_M^MDC");
    }

  }

  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }


}
