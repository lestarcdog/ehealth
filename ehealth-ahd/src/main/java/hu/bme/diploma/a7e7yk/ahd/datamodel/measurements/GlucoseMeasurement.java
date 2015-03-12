package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.helper.MeasurementHelper;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class GlucoseMeasurement extends AbstractMeasurement {

  private Double glucose;

  public GlucoseMeasurement() {
    super(new SnomedConcept("359772000", "Glucose monitoring at home"));
  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    OBX obx;
    obx = builder.provideOBX();
    // MDS
    MeasurementHelper.initObxSegment(obx, "X", this.timeModel.getMeasurementTime());
    // 528391^MDC_DEV_SPEC_PROFILE_BP^MDC
    MeasurementHelper.setObxField3ObservationId(obx, "528401^MDC_DEV_SPEC_PROFILE_SCALE^MDC");
    obx.getObx4_ObservationSubID().setValue(this.getObservationalId().getFirstGroup());
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi1_EntityIdentifier().setValue("0123456789ABCDEF");
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi2_NamespaceID().setValue("EUI-64");

    if (glucose != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.timeModel.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      MeasurementHelper.setObxField3ObservationId(obx, "160184^MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD^MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeVale(obx, builder.getHL7Message(), glucose);
      MeasurementHelper.setObxField6Unit(obx, "264274^MDC_DIM_MILLI_G_PER_DL^MDC");
    }
  }

  public Double getGlucose() {
    return glucose;
  }

  public void setGlucose(Double glucose) {
    this.glucose = glucose;
  }



}
