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
    obx = builder.provideOBX();

    if (spo2 != null) {
      obx = builder.provideOBX();
      obxs.add(obx);
      obx.getObx2_ValueType().setValue("NM");
      // 150456^MDC_PULS_OXIM_SAT_O2^MDC
      MeasurementHelper.setObxField3(obx, "150456", "MDC_PULS_OXIM_SAT_O2", "MDC");
      obx.getObx4_ObservationSubID().setValue(majorGroup + ".0.0.1");
      obx.getObx5_ObservationValue(0).setData(new NM(builder.getMessage()) {
        {
          setValue(spo2.toString());
        }
      });
      // 262688^MDC_DIM_PERCENT^MDC
      MeasurementHelper.setObxField6(obx, "262688", "MDC_DIM_PERCENT", "MDC");
    }
    if (pulseRate != null) {
      obx = builder.provideOBX();
      obxs.add(obx);
      obx.getObx2_ValueType().setValue("NM");
      // 149530^MDC_PULS_OXIM_PULS_RATE^MDC
      MeasurementHelper.setObxField3(obx, "149530", "MDC_PULS_OXIM_PULS_RATE", "MDC");
      obx.getObx4_ObservationSubID().setValue(majorGroup + ".0.0.1");
      obx.getObx5_ObservationValue(0).setData(new NM(builder.getMessage()) {
        {
          setValue(pulseRate.toString());
        }
      });
    }
    // 264864^MDC_DIM_BEAT_PER_MIN^MDC
    return obxs;
  }
}
