package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.helper.MeasurementHelper;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class WeightScaleMeasurement extends AbstractMeasurement {
  private Double weight;
  private Double height;


  public WeightScaleMeasurement() {
    super(new SnomedConcept("307818003", "Weight monitoring"));
  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    OBX obx = builder.provideOBX();
    // MDS
    MeasurementHelper.initObxSegment(obx, "X", this.timeModel.getMeasurementTime());
    MeasurementHelper.setObxField3ObservationId(obx, "528399^MDC_DEV_SPEC_PROFILE_SCALE^MDC");
    obx.getObx4_ObservationSubID().setValue(getObservationalId().getFirstGroup());
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi1_EntityIdentifier().setValue("0123456789ABCDEF");
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi2_NamespaceID().setValue("EUI-64");

    if (weight != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.timeModel.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      // 150021^MDC_PRESS_BLD_NONINV_SYS^MDC
      MeasurementHelper.setObxField3ObservationId(obx, "188736^MDC_MASS_BODY_ACTUAL^MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeVale(obx, builder.getHL7Message(), weight);
      // 266016^MDC_DIM_MMHG^MDC
      MeasurementHelper.setObxField6Unit(obx, "263875^MDC_DIM_KILO_G^MDC");
    }

    if (height != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.timeModel.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      // 150021^MDC_PRESS_BLD_NONINV_SYS^MDC
      MeasurementHelper.setObxField3ObservationId(obx, "188740^MDC_LEN_BODY_ACTUAL^MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeVale(obx, builder.getHL7Message(), height);
      // 266016^MDC_DIM_MMHG^MDC
      MeasurementHelper.setObxField6Unit(obx, "263441^MDC_DIM_CENTI_M^MDC");
    }



  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }


}
