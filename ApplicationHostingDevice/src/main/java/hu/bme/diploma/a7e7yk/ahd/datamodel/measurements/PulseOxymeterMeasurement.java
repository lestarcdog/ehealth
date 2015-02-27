package hu.bme.diploma.a7e7yk.ahd.datamodel.measurements;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.SnomedConcept;
import hu.bme.diploma.a7e7yk.ahd.runtime.IMessageBuilder;

import java.util.ArrayList;
import java.util.List;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v26.datatype.NM;
import ca.uhn.hl7v2.model.v26.segment.OBX;

public class PulseOxymeterMeasurement extends AbstractMeasurement {

  private Double spo2;
  private Double spo2Accuracy;
  private String measurementStatus;
  private Double pulseRate;
  private Double pulsatileQuality;

  public PulseOxymeterMeasurement(IMessageBuilder builder, String majorGroup) {
    super(new SnomedConcept("284034009", "Pulse oximetry monitoring "), builder, majorGroup);
  }

  @Override
  protected List<OBX> getMeasurementOBXs() throws DataTypeException {
    List<OBX> obxs = new ArrayList<OBX>();
    OBX obx;
    if (spo2 != null) {
      obx = builder.provideOBX();
      obx.getObx2_ValueType().setValue("NM");
      // 528388^MDC_DEV_SPEC_PROFILE_PULS_OXIM^MDC
      obx.getObx3_ObservationIdentifier().getCwe1_Identifier().setValue("528388");
      obx.getObx3_ObservationIdentifier().getCwe2_Text().setValue("MDC_DEV_SPEC_PROFILE_PULS_OXIM");
      obx.getObx3_ObservationIdentifier().getCwe3_NameOfCodingSystem().setValue("MDC");
      obx.getObx4_ObservationSubID().setValue(majorGroup + "0.0.1");
      obx.getObx5_ObservationValue(0).setData(new NM(builder.getMessage()) {
        {
          setValue(spo2.toString());
        }
      });
      // 262688^MDC_DIM_PERCENT^MDC
      obx.getObx6_Units().getCwe1_Identifier().setValue("262688");
      obx.getObx6_Units().getCwe2_Text().setValue("MDC_DIM_PERCENT");
      obx.getObx6_Units().getCwe3_NameOfCodingSystem().setValue("MDC");
    }
    if (spo2Accuracy != null) {

    }
    return obxs;
  }
}
