package hu.bme.diploma.a7e7yk.datamodel.ahd.measurements;

import hu.bme.diploma.a7e7yk.datamodel.ahd.measurements.helper.MeasurementHelper;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.SnomedConcept;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class Thermometer extends AbstractMeasurement {

  private Double temp;

  public Thermometer() {
    super(new SnomedConcept("133879001", "Monitoring of patient temperature "));

  }

  @Override
  protected void generateMeasurementOBXs() throws DataTypeException {
    OBX obx;
    obx = builder.provideOBX();
    // MDS
    MeasurementHelper.initObxSegment(obx, "X", this.measurementTime.getMeasurementTime());
    MeasurementHelper.setObxField3ObservationId(obx, "528392^MDC_DEV_SPEC_PROFILE_TEMP^MDC");
    obx.getObx4_ObservationSubID().setValue(this.getObservationalId().getFirstGroup());
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi1_EntityIdentifier().setValue("0123456789ABCDEF");
    obx.getObx18_EquipmentInstanceIdentifier(0).getEi2_NamespaceID().setValue("EUI-64");

    if (this.temp != null) {
      obx = builder.provideOBX();
      MeasurementHelper.initObxSegment(obx, "R", this.measurementTime.getMeasurementTime());
      obx.getObx2_ValueType().setValue("NM");
      MeasurementHelper.setObxField3ObservationId(obx, "150364^MDC_TEMP_BODY^MDC");
      obx.getObx4_ObservationSubID().setValue(getObservationalId().getNextFourthId());
      MeasurementHelper.setObxField5NMTypeValue(obx, builder.getHL7Message(), this.temp);
      MeasurementHelper.setObxField6Unit(obx, "268192^MDC_DIM_DEGC^MDC");
    }
  }

  public Double getTemp() {
    return temp;
  }

  public void setTemp(Double temp) {
    this.temp = temp;
  }
}
