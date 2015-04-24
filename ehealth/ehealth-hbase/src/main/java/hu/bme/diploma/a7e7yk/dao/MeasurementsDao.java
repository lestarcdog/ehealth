package hu.bme.diploma.a7e7yk.dao;

import hu.bme.diploma.a7e7yk.datamodel.health.values.VitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.GlucoseVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.PulseOxyMeterVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ThermometerVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.WeightScaleVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;
import hu.bme.diploma.a7e7yk.exceptions.UndefinedMdcTypeException;
import hu.bme.diploma.a7e7yk.functions.TriConsumer;
import hu.bme.diploma.a7e7yk.hbase.HbaseConstants;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

/**
 * Dao for {@link AbstractVitalSign} objects
 */
@Stateless
@Local
public class MeasurementsDao {
  private final HbaseCommonDao commonDao;

  public MeasurementsDao() throws IOException {
    commonDao = new HbaseCommonDao(HbaseConstants.MEASUREMENTS_TABLENAME);
  }

  public MeasurementsDao(TableName measurementsTable) throws IOException {
    commonDao = new HbaseCommonDao(measurementsTable);
  }

  public void persistMeasurement(String userId, AbstractVitalSign vitalSign) throws EhealthException {
    if (vitalSign instanceof ActivityMonitorVitalSign) {
      persistMeasurement(userId, (ActivityMonitorVitalSign) vitalSign);

    } else if (vitalSign instanceof GlucoseVitalSign) {
      persistMeasurement(userId, (GlucoseVitalSign) vitalSign);

    } else if (vitalSign instanceof BloodPressureVitalSign) {
      persistMeasurement(userId, (BloodPressureVitalSign) vitalSign);

    } else if (vitalSign instanceof PulseOxyMeterVitalSign) {
      persistMeasurement(userId, (PulseOxyMeterVitalSign) vitalSign);

    } else if (vitalSign instanceof ThermometerVitalSign) {
      persistMeasurement(userId, (ThermometerVitalSign) vitalSign);

    } else if (vitalSign instanceof WeightScaleVitalSign) {
      persistMeasurement(userId, (WeightScaleVitalSign) vitalSign);

    } else {
      throw new UndefinedMdcTypeException(vitalSign.getMdcMeasurementType());
    }
  }

  public void persistMeasurement(String userId, ActivityMonitorVitalSign vitalSign) throws EhealthException {
    Put p = createPut(userId, vitalSign);
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getActivePeriod());
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getSpeed());
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getAltitude());
    commonDao.putInMeasurementsTable(p);
  }

  public void persistMeasurement(String userId, GlucoseVitalSign vitalSign) throws EhealthException {
    Put p = createPut(userId, vitalSign);
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getGlucose());
    commonDao.putInMeasurementsTable(p);
  }

  public void persistMeasurement(String userId, BloodPressureVitalSign vitalSign) throws EhealthException {
    Put p = createPut(userId, vitalSign);
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getDiastolic());
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getPulseRate());
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getSystolic());
    commonDao.putInMeasurementsTable(p);
  }

  public void persistMeasurement(String userId, PulseOxyMeterVitalSign vitalSign) throws EhealthException {
    Put p = createPut(userId, vitalSign);
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getPulseRate());
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getSpo2());
    commonDao.putInMeasurementsTable(p);
  }

  public void persistMeasurement(String userId, ThermometerVitalSign vitalSign) throws EhealthException {
    Put p = createPut(userId, vitalSign);
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getTemp());
    commonDao.putInMeasurementsTable(p);
  }

  public void persistMeasurement(String userId, WeightScaleVitalSign vitalSign) throws EhealthException {
    Put p = createPut(userId, vitalSign);
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getHeight());
    addColumnToPut(p, vitalSign.getMeasurementTime(), vitalSign.getWeight());
    commonDao.putInMeasurementsTable(p);
  }

  public <T> List<T> findByRowkey(String userId, MdcNomenclatureValue vitalSignType, ZonedDateTime datetime,
      Class<T> clazz) throws EhealthException {
    List<Cell> cells = commonDao.getMeasurements(new Get(getRowKeyForMeasurements(userId, vitalSignType, datetime)));
    return (List<T>) convertColumnToAbstractVitalSign(cells, vitalSignType, datetime);
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
    byte[] b = Bytes.add(Bytes.toBytes(valueId), Bytes.toBytes(timepart), Bytes.toBytes(unitId));
    return b;
  }

  private MeasurementsColumnFields extractColumnFields(Cell cell) {
    byte[] b = HbaseDaoHelper.getColumnQualifierFromCell(cell);
    int valueId = Bytes.toInt(Bytes.copy(b, 0, 4));
    int timepart = Bytes.toInt(Bytes.copy(b, 4, 4));
    int unitId = Bytes.toInt(Bytes.copy(b, 8, 4));
    return new MeasurementsColumnFields(valueId, timepart, unitId);
  }

  /**
   * Creates the rowkey from the inputs
   * <p>
   * length of the userId + separator char length | 4 byte type of the measurement | 4 byte timebase
   * </p>
   * 
   * @param userId userId
   * @param vitalSign
   * @return
   */
  private byte[] getRowKeyForMeasurements(String userId, MdcNomenclatureValue vitalSignType, ZonedDateTime datetime) {
    int timebase = HbaseDaoHelper.getRowKeyTimePart(datetime.toInstant().toEpochMilli());
    byte[] uidBytes = Bytes.toBytes(userId + HbaseConstants.ROWKEY_SEPARATOR);
    return Bytes.add(uidBytes, Bytes.toBytes(vitalSignType.getId()), Bytes.toBytes(timebase));
  }

  /**
   * Created a new Put with the rowkeys from the input
   * 
   * @param userId
   * @param vitalSign
   * @return
   */
  private Put createPut(String userId, AbstractVitalSign vitalSign) {
    return new Put(getRowKeyForMeasurements(userId, vitalSign.getMdcMeasurementType(), vitalSign.getMeasurementTime()));
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

  private List<? extends AbstractVitalSign> convertColumnToAbstractVitalSign(List<Cell> cells,
      MdcNomenclatureValue vitalSignMdcType, ZonedDateTime time) throws EhealthException {
    int vsTypeId = vitalSignMdcType.getId();
    int rowkeyTimepart = HbaseDaoHelper.getUnreversedRowKeyTimePart(time.toInstant().toEpochMilli());

    if (vsTypeId == ActivityMonitorVitalSign.MDC_VALUE.getId()) {
      return convertCellsToVitalSignTemplate(this::convertCellToVitalSign, cells, rowkeyTimepart,
          ActivityMonitorVitalSign.class);

    } else if (vsTypeId == GlucoseVitalSign.MDC_VALUE.getId()) {
      return convertCellsToVitalSignTemplate(this::convertCellToVitalSign, cells, rowkeyTimepart,
          GlucoseVitalSign.class);

    } else if (vsTypeId == BloodPressureVitalSign.MDC_VALUE.getId()) {
      return convertCellsToVitalSignTemplate(this::convertCellToVitalSign, cells, rowkeyTimepart,
          BloodPressureVitalSign.class);

    } else if (vsTypeId == PulseOxyMeterVitalSign.MDC_VALUE.getId()) {
      return convertCellsToVitalSignTemplate(this::convertCellToVitalSign, cells, rowkeyTimepart,
          PulseOxyMeterVitalSign.class);

    } else if (vsTypeId == ThermometerVitalSign.MDC_VALUE.getId()) {
      return convertCellsToVitalSignTemplate(this::convertCellToVitalSign, cells, rowkeyTimepart,
          ThermometerVitalSign.class);

    } else if (vsTypeId == WeightScaleVitalSign.MDC_VALUE.getId()) {
      return convertCellsToVitalSignTemplate(this::convertCellToVitalSign, cells, rowkeyTimepart,
          WeightScaleVitalSign.class);

    }
    throw new UndefinedMdcTypeException(vitalSignMdcType);
  }

  /**
   * Templateable function for creating {@link AbstractVitalSign} subtypes.
   * 
   * @param function vitalSign specific conversion
   * @param cells from the data will be read
   * @param rowkeyTimepart datetime upper part
   * @param clazz return type of the class
   * @return
   * @throws EhealthException
   */
  private <T extends AbstractVitalSign> List<T> convertCellsToVitalSignTemplate(TriConsumer<T, Integer, Cell> function,
      List<Cell> cells, int rowkeyTimepart, Class<T> clazz) throws EhealthException {
    List<T> ret = new LinkedList<>();
    int columnTimePart = -1;
    T v = null;

    try {
      for (Cell cell : cells) {
        MeasurementsColumnFields fields = extractColumnFields(cell);
        // timepart is different new vitalsign
        if (fields.getColumnTimepart() != columnTimePart) {
          columnTimePart = fields.getColumnTimepart();
          v = clazz.newInstance();
          v.setMeasurementTime(HbaseDaoHelper.mergeTimeparts(rowkeyTimepart, columnTimePart));
          ret.add(v);
        }
        // populate object
        function.accept(v, fields.getValueId(), cell);
      }
    } catch (Exception e) {
      throw new EhealthException(e);
    }
    return ret;
  }

  private void convertCellToVitalSign(WeightScaleVitalSign v, int valueId, Cell cell) throws UndefinedMdcTypeException {
    if (valueId == v.getHeight().getType().getId()) {
      v.getHeight().setValue(HbaseDaoHelper.getColumnValueFromCellAsDouble(cell));

    } else if (valueId == v.getWeight().getType().getId()) {
      v.getWeight().setValue(HbaseDaoHelper.getColumnValueFromCellAsDouble(cell));

    } else {
      throw new UndefinedMdcTypeException(valueId);
    }
  }

  private void convertCellToVitalSign(PulseOxyMeterVitalSign v, int valueId, Cell cell)
      throws UndefinedMdcTypeException {
    if (valueId == v.getPulseRate().getType().getId()) {
      v.getPulseRate().setValue(HbaseDaoHelper.getColumnValueFromCellAsDouble(cell));

    } else if (valueId == v.getSpo2().getType().getId()) {
      v.getSpo2().setValue(HbaseDaoHelper.getColumnValueFromCellAsDouble(cell));

    } else {
      throw new UndefinedMdcTypeException(valueId);
    }
  }

  private void convertCellToVitalSign(ThermometerVitalSign v, int valueId, Cell cell) throws UndefinedMdcTypeException {
    if (valueId == v.getTemp().getType().getId()) {
      v.getTemp().setValue(HbaseDaoHelper.getColumnValueFromCellAsDouble(cell));
    } else {
      throw new UndefinedMdcTypeException(valueId);
    }
  }

  private void convertCellToVitalSign(GlucoseVitalSign v, int valueId, Cell cell) throws UndefinedMdcTypeException {
    if (valueId == v.getGlucose().getType().getId()) {
      v.getGlucose().setValue(HbaseDaoHelper.getColumnValueFromCellAsDouble(cell));
    } else {
      throw new UndefinedMdcTypeException(valueId);
    }
  }

  private void convertCellToVitalSign(BloodPressureVitalSign v, int valueId, Cell cell)
      throws UndefinedMdcTypeException {
    if (valueId == v.getDiastolic().getType().getId()) {
      v.getDiastolic().setValue(HbaseDaoHelper.getColumnValueFromCellAsDouble(cell));

    } else if (valueId == v.getPulseRate().getType().getId()) {
      v.getPulseRate().setValue(HbaseDaoHelper.getColumnValueFromCellAsDouble(cell));

    } else if (valueId == v.getSystolic().getType().getId()) {
      v.getSystolic().setValue(HbaseDaoHelper.getColumnValueFromCellAsDouble(cell));

    } else {
      throw new UndefinedMdcTypeException(valueId);
    }
  }

  private void convertCellToVitalSign(ActivityMonitorVitalSign v, int valueId, Cell cell)
      throws UndefinedMdcTypeException {
    if (valueId == v.getSpeed().getType().getId()) {
      // speed
      v.getSpeed().setValue(HbaseDaoHelper.getColumnValueFromCellAsDouble(cell));

    } else if (valueId == v.getActivePeriod().getType().getId()) {
      // active period
      v.getActivePeriod().setValue(HbaseDaoHelper.getColumnValueFromCellAsDouble(cell));

    } else if (valueId == v.getAltitude().getType().getId()) {
      // altitude
      v.getAltitude().setValue(HbaseDaoHelper.getColumnValueFromCellAsDouble(cell));

    } else {
      throw new UndefinedMdcTypeException(valueId);
    }
  }

  private static class MeasurementsRowkeyFields {
    private final String userId;
    private final int measurementId;
    private final int rowkeyTimepart;

    public MeasurementsRowkeyFields(String userId, int measurementId, int rowkeyTimepart) {
      this.userId = userId;
      this.measurementId = measurementId;
      this.rowkeyTimepart = rowkeyTimepart;
    }

    public String getUserId() {
      return userId;
    }

    public int getMeasurementId() {
      return measurementId;
    }

    public int getRowkeyTimepart() {
      return rowkeyTimepart;
    }


  }

  private static class MeasurementsColumnFields {
    private final int valueId;
    private final int columnTimepart;
    private final int unitId;

    public MeasurementsColumnFields(int valueId, int columnTimepart, int unitId) {
      this.valueId = valueId;
      this.columnTimepart = columnTimepart;
      this.unitId = unitId;
    }

    public int getValueId() {
      return valueId;
    }

    public int getColumnTimepart() {
      return columnTimepart;
    }

    public int getUnitId() {
      return unitId;
    }
  }

}
