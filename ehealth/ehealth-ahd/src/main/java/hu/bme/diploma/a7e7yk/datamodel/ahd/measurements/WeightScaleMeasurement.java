package hu.bme.diploma.a7e7yk.datamodel.ahd.measurements;

import hu.bme.diploma.a7e7yk.datamodel.ahd.measurements.helper.MeasurementHelper;
import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.WeightScaleValue;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class WeightScaleMeasurement extends AbstractMeasurement {

  private WeightScaleValue value;

  public WeightScaleMeasurement() {
    super(new SnomedConcept("307818003", "Weight monitoring"));
  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    OBX obx = builder.provideOBX();
    // MDS
    MeasurementHelper.initObxSegment(obx, "X", this.measurementTime.getMeasurementTime());
    MeasurementHelper.setObxField3ObservationId(obx, "528399^MDC_DEV_SPEC_PROFILE_SCALE^MDC");
    obx.getObx4_ObservationSubID().setValue(getObservationalId().getFirstGroup());
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi1_EntityIdentifier()
        .setValue("0123456789ABCDEF");
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi2_NamespaceID().setValue("EUI-64");

    if (value.getWeight() != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.measurementTime.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      // 150021^MDC_PRESS_BLD_NONINV_SYS^MDC
      MeasurementHelper.setObxField3ObservationId(obx, "188736^MDC_MASS_BODY_ACTUAL^MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeValue(obx, builder.getHL7Message(), value.getWeight());
      // 266016^MDC_DIM_MMHG^MDC
      MeasurementHelper.setObxField6Unit(obx, "263875^MDC_DIM_KILO_G^MDC");
    }

    if (value.getHeight() != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.measurementTime.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      // 150021^MDC_PRESS_BLD_NONINV_SYS^MDC
      MeasurementHelper.setObxField3ObservationId(obx, "188740^MDC_LEN_BODY_ACTUAL^MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeValue(obx, builder.getHL7Message(), value.getHeight());
      // 266016^MDC_DIM_MMHG^MDC
      MeasurementHelper.setObxField6Unit(obx, "263441^MDC_DIM_CENTI_M^MDC");
    }
  }

  public WeightScaleValue getValue() {
    return value;
  }

  public void setValue(WeightScaleValue value) {
    this.value = value;
  }

}
