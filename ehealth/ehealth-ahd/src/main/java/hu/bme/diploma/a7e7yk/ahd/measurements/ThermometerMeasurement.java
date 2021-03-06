package hu.bme.diploma.a7e7yk.ahd.measurements;

import hu.bme.diploma.a7e7yk.ahd.measurements.helper.MeasurementHelper;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ThermometerVitalSign;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class ThermometerMeasurement extends AbstractMeasurement<ThermometerVitalSign> {

  public ThermometerMeasurement() {
    super(ThermometerVitalSign.SNOMED_CONCEPT);

  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    OBX obx;
    obx = builder.provideOBX();
    // MDS
    MeasurementHelper.initObxSegment(obx, "X", value.getMeasurementTime());
    MeasurementHelper.setObxField3ObservationId(obx, "528392^MDC_DEV_SPEC_PROFILE_TEMP^MDC");
    obx.getObx4_ObservationSubID().setValue(this.getObservationalId().getFirstGroup());
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi1_EntityIdentifier().setValue("0123456789ABCDEF");
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi2_NamespaceID().setValue("EUI-64");

    if (value.getTemp() != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", value.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      MeasurementHelper.setObxField3ObservationId(obx, "150364^MDC_TEMP_BODY^MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeValue(obx, builder.getHL7Message(), value.getTemp().getValue());
      MeasurementHelper.setObxField6Unit(obx, "268192^MDC_DIM_DEGC^MDC");
    }
  }
}
