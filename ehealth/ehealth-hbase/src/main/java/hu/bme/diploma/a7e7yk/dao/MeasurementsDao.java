package hu.bme.diploma.a7e7yk.dao;

import hu.bme.diploma.a7e7yk.datamodel.health.values.VitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.GlucoseVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.PulseOxyMeterVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ThermometerVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.WeightScaleVitalSign;
import hu.bme.diploma.a7e7yk.hbase.HbaseConstants;

import java.io.IOException;
import java.time.ZonedDateTime;

import javax.ejb.Local;
import javax.ejb.Stateless;

import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

@Stateless
@Local
public class MeasurementsDao {
  private HbaseCommonDao commonDao;

  public MeasurementsDao() throws IOException {
    commonDao = new HbaseCommonDao();
  }

  public void persistMeasurement(String userId, ActivityMonitorVitalSign vitalSign) {
    Put p = createPut(userId, vitalSign);
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getActivePeriod());
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getSpeed());
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getAltitude());
    commonDao.putInMeasurementsTable(p);
  }

  public void persistMeasurement(String userId, GlucoseVitalSign vitalSign) {
    Put p = createPut(userId, vitalSign);
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getGlucose());
    commonDao.putInMeasurementsTable(p);
  }

  public void persistMeasurement(String userId, BloodPressureVitalSign vitalSign) {
    Put p = createPut(userId, vitalSign);
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getDiastolic());
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getPulseRate());
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getSystolic());
    commonDao.putInMeasurementsTable(p);
  }

  public void persistMeasurement(String userId, PulseOxyMeterVitalSign vitalSign) {
    Put p = createPut(userId, vitalSign);
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getPulseRate());
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getSpo2());
    commonDao.putInMeasurementsTable(p);
  }

  public void persistMeasurement(String userId, ThermometerVitalSign vitalSign) {
    Put p = createPut(userId, vitalSign);
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getTemp());
    commonDao.putInMeasurementsTable(p);
  }

  public void persistMeasurement(String userId, WeightScaleVitalSign vitalSign) {
    Put p = createPut(userId, vitalSign);
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getHeight());
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getWeight());
    commonDao.putInMeasurementsTable(p);
  }


  /**
   * Creates the column qualifier
   * <p>
   * 4 byte measurement value type | 4 byte timepart | 4 byte unit of the
   * </p>
   * measurement
   * 
   * @param timepart epoch millies time part
   * @param vitalSign vitalsign
   * @return
   */
  private byte[] getColumnQualifierForMeasurements(int timepart, VitalSignValue<?> vitalSign) {
    int valueId = vitalSign.getType().getId();
    int unitId = vitalSign.getUnit().getId();
    return Bytes.add(Bytes.toBytes(valueId), Bytes.toBytes(timepart), Bytes.toBytes(unitId));
  }

  /**
   * Creates the rowkey from the inputs
   * <p>
   * length of the userId + separator char length | 4 byte timebase | 4 byte type of the measurement
   * </p>
   * 
   * @param userId userId
   * @param vitalSign
   * @return
   */
  private byte[] getRowKeyForMeasurements(String userId, AbstractVitalSign vitalSign) {
    int timebase = HbaseDaoHelper.getRowKeyTimePart(vitalSign.getMeasurementTime().toInstant().toEpochMilli());
    byte[] uidBytes = Bytes.toBytes(userId + HbaseConstants.ROWKEY_SEPARATOR);
    return Bytes.add(uidBytes, Bytes.toBytes(timebase), Bytes.toBytes(vitalSign.getMdcMeasurementType().getId()));
  }

  /**
   * Created a new Put with the rowkeys from the input
   * 
   * @param userId
   * @param vitalSign
   * @return
   */
  private Put createPut(String userId, AbstractVitalSign vitalSign) {
    return new Put(getRowKeyForMeasurements(userId, vitalSign));
  }

  /**
   * Add a new column to the put value. Nulls are not inserted
   * 
   * @param p put to insert the new column
   * @param measurementTime measurement time of the value
   * @param value value to be inserted
   */
  private void addColumnToPut(Put p, ZonedDateTime measurementTime, VitalSignValue<Double> value) {
    if (value == null || value.getValue() == null) {
      return;
    }
    int timepart = HbaseDaoHelper.getColumnTimePart(measurementTime.toInstant().toEpochMilli());
    p.addColumn(HbaseConstants.MEASUREMENTS_CF, getColumnQualifierForMeasurements(timepart, value),
        Bytes.toBytes(value.getValue()));
  }

}
