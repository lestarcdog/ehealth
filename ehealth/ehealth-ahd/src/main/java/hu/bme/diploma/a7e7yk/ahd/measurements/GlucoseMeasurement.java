package hu.bme.diploma.a7e7yk.ahd.measurements;

import hu.bme.diploma.a7e7yk.ahd.measurements.helper.MeasurementHelper;
import hu.bme.diploma.a7e7yk.datamodel.health.SnomedConcept;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.GlucoseValue;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class GlucoseMeasurement extends AbstractMeasurement<GlucoseValue> {

  public GlucoseMeasurement() {
    super(new SnomedConcept("359772000", "Glucose monitoring at home"));
  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    OBX obx;
    obx = builder.provideOBX();
    // MDS
    MeasurementHelper.initObxSegment(obx, "X", value.getMeasurementTime());
    MeasurementHelper.setObxField3ObservationId(obx, "528401^MDC_DEV_SPEC_PROFILE_GLUCOSE^MDC");
    obx.getObx4_ObservationSubID().setValue(this.getObservationalId().getFirstGroup());
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi1_EntityIdentifier().setValue("0123456789ABCDEF");
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi2_NamespaceID().setValue("EUI-64");

    if (value != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", value.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      MeasurementHelper.setObxField3ObservationId(obx, "160184^MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD^MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeValue(obx, builder.getHL7Message(), value.getGlucose());
      MeasurementHelper.setObxField6Unit(obx, "264274^MDC_DIM_MILLI_G_PER_DL^MDC");
    }
  }

}
