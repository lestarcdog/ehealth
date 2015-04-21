package hu.bme.diploma.a7e7yk.ahd.measurements;

import hu.bme.diploma.a7e7yk.ahd.measurements.helper.MeasurementHelper;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.PulseOxyMeter;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.datatype.NM;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class PulseOxymeterMeasurement extends AbstractMeasurement<PulseOxyMeter> {

  public PulseOxymeterMeasurement() {
    super(PulseOxyMeter.SNOMED_CONCEPT);
  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    OBX obx;
    obx = builder.provideOBX();
    // MDS
    MeasurementHelper.initObxSegment(obx, "X", value.getMeasurementTime());
    // 528388^MDC_DEV_SPEC_PROFILE_PULS_OXIM^MDC
    MeasurementHelper.setObxField3ObservationId(obx, "528388", "MDC_DEV_SPEC_PROFILE_PULS_OXIM", "MDC");
    obx.getObx4_ObservationSubID().setValue(getObservationalId().getFirstGroup());
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi1_EntityIdentifier().setValue("0123456789ABCDEF");
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi2_NamespaceID().setValue("EUI-64");

    if (value.getSpo2() != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", value.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      // 150456^MDC_PULS_OXIM_SAT_O2^MDC
      MeasurementHelper.setObxField3ObservationId(obx, "150456", "MDC_PULS_OXIM_SAT_O2", "MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      obx.getObx5_ObservationValue(0).setData(new NM(builder.getHL7Message()) {
        {
          setValue(value.getSpo2().toString());
        }
      });
      // 262688^MDC_DIM_PERCENT^MDC
      MeasurementHelper.setObxField6Unit(obx, "262688", "MDC_DIM_PERCENT", "MDC");
    }
    if (value.getPulseRate() != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", value.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      // 149530^MDC_PULS_OXIM_PULS_RATE^MDC
      MeasurementHelper.setObxField3ObservationId(obx, "149530", "MDC_PULS_OXIM_PULS_RATE", "MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      obx.getObx5_ObservationValue(0).setData(new NM(builder.getHL7Message()) {
        {
          setValue(value.getPulseRate().toString());
        }
      });
      // 264864^MDC_DIM_BEAT_PER_MIN^MDC
      MeasurementHelper.setObxField6Unit(obx, "264864", "MDC_DIM_BEAT_PER_MIN", "MDC");
    }

  }
}
