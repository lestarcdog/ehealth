package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.helper.MeasurementHelper;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.datatype.NM;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class PulseOxymeterMeasurement extends AbstractMeasurement {

  private Double spo2;
  private Double spo2Accuracy;
  private String measurementStatus;
  private Double pulseRate;
  private Double pulsatileQuality;

  public PulseOxymeterMeasurement() {
    super(new SnomedConcept("284034009", "Pulse oximetry monitoring "));
  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    OBX obx;
    obx = builder.provideOBX();
    // MDS
    MeasurementHelper.initObxSegment(obx, "X", this.timeModel.getMeasurementTime());
    // 528388^MDC_DEV_SPEC_PROFILE_PULS_OXIM^MDC
    MeasurementHelper.setObxField3ObservationId(obx, "528388", "MDC_DEV_SPEC_PROFILE_PULS_OXIM", "MDC");
    obx.getObx4_ObservationSubID().setValue(getObservationalId().getFirstGroup());
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi1_EntityIdentifier().setValue("0123456789ABCDEF");
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi2_NamespaceID().setValue("EUI-64");

    if (spo2 != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.timeModel.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      // 150456^MDC_PULS_OXIM_SAT_O2^MDC
      MeasurementHelper.setObxField3ObservationId(obx, "150456", "MDC_PULS_OXIM_SAT_O2", "MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      obx.getObx5_ObservationValue(0).setData(new NM(builder.getHL7Message()) {
        {
          setValue(spo2.toString());
        }
      });
      // 262688^MDC_DIM_PERCENT^MDC
      MeasurementHelper.setObxField6Unit(obx, "262688", "MDC_DIM_PERCENT", "MDC");
    }
    if (pulseRate != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.timeModel.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      // 149530^MDC_PULS_OXIM_PULS_RATE^MDC
      MeasurementHelper.setObxField3ObservationId(obx, "149530", "MDC_PULS_OXIM_PULS_RATE", "MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      obx.getObx5_ObservationValue(0).setData(new NM(builder.getHL7Message()) {
        {
          setValue(pulseRate.toString());
        }
      });
      // 264864^MDC_DIM_BEAT_PER_MIN^MDC
      MeasurementHelper.setObxField6Unit(obx, "264864", "MDC_DIM_BEAT_PER_MIN", "MDC");
    }

  }

  public Double getSpo2() {
    return spo2;
  }

  public void setSpo2(Double spo2) {
    this.spo2 = spo2;
  }

  public Double getPulseRate() {
    return pulseRate;
  }

  public void setPulseRate(Double pulseRate) {
    this.pulseRate = pulseRate;
  }
}
