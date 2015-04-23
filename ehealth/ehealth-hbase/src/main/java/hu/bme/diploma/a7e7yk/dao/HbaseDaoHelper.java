package hu.bme.diploma.a7e7yk.dao;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.datamodel.health.values.VitalSignValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.hbase.HbaseConstants;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class HbaseDaoHelper {
  private HbaseDaoHelper() {}

  /**
   * Converts the epoch millis into the output with {@link EhealthConstants#DEFAULT_BUDAPEST_ZONEID}
   * timezone.
   * 
   * @param millis epoch time in millis
   * @return
   */
  public static ZonedDateTime convert2LocalDate(long millis) {
    return convert2LocalDate(millis, EhealthConstants.DEFAULT_BUDAPEST_ZONEID);
  }

  /**
   * Converts the epoch millis into the output with {@link EhealthConstants#DEFAULT_BUDAPEST_ZONEID}
   * timezone.
   * 
   * @param millis epoch time in millis
   * @param zoneId zone id to convert
   * @return
   */
  public static ZonedDateTime convert2LocalDate(long millis, ZoneId zoneId) {
    return ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis), zoneId);
  }

  /**
   * Returns the rowkey part of the timestamp in millies. The return value is a reversed timestamp.
   * 
   * @param millis extract the rowkey part from
   * @return reversed integer
   */
  private static int getTimeRowKeyPart(long millis) {
    long seconds = millis / 1000;
    return reverse((int) (seconds / HbaseConstants.BASE_PART_MODULUS));
  }

  /**
   * Returns the column part of the timestamp in seconds.
   * 
   * @param millis extract the seconds up.
   * @return timestamp part
   */
  private static int getTimeColumnPart(long millis) {
    long seconds = millis / 1000;
    return (int) (seconds % HbaseConstants.BASE_PART_MODULUS);
  }

  /**
   * Returns the compound object contains the converted timepart for the rowkey and the column field
   * 
   * @param millis epoch millies
   * @return
   */
  public static TimeParts getTimeParts(long millis) {
    long seconds = millis / 1000;
    int rk = reverse((int) (seconds / HbaseConstants.BASE_PART_MODULUS));
    int cp = (int) (seconds % HbaseConstants.BASE_PART_MODULUS);
    return new TimeParts(rk, cp);
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
  public static byte[] getColumnQualifierForMeasurements(int timepart, VitalSignValue<?> vitalSign) {
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
  public static byte[] getRowKeyForMeasurements(String userId, AbstractVitalSign vitalSign) {
    int timebase = getTimeRowKeyPart(vitalSign.getMeasurementTime().toInstant().toEpochMilli());
    byte[] uidBytes = Bytes.toBytes(userId + HbaseConstants.ROWKEY_SEPARATOR);
    return Bytes.add(uidBytes, Bytes.toBytes(timebase), Bytes.toBytes(vitalSign.getMdcMeasurementType().getId()));
  }

  public static Put createPut(String userid, AbstractVitalSign vitalSign) {
    return new Put(getRowKeyForMeasurements(userid, vitalSign));
  }

  public static void addColumnToPut(Put p, ZonedDateTime measurementTime, VitalSignValue<Double> value) {
    int timepart = getTimeColumnPart(measurementTime.toInstant().toEpochMilli());
    p.addColumn(HbaseConstants.MEASUREMENTS_CF, getColumnQualifierForMeasurements(timepart, value),
        Bytes.toBytes(value.getValue()));
  }

  private static int reverse(int time) {
    return Integer.MAX_VALUE - time;
  }

  /**
   * Dto class for time conversion. The divided timeparts stored in the respective fields. The
   * {@link TimeParts#rowkeyPart} is reversed.
   *
   */
  public static class TimeParts {
    private final int rowkeyPart;
    private final int columnPart;

    public TimeParts(int rowkeyPart, int columnPart) {
      this.rowkeyPart = rowkeyPart;
      this.columnPart = columnPart;
    }

    public int getRowkeyPart() {
      return rowkeyPart;
    }

    public int getColumnPart() {
      return columnPart;
    }

  }
}
