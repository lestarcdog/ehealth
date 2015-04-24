package hu.bme.diploma.a7e7yk.dao;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.apache.hadoop.hbase.Cell;
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
  public static int getRowKeyTimePart(long millis) {
    long seconds = millis / EhealthConstants.TIMEBASE_PRECISION_DIVIDER;
    return reverse((int) (seconds / EhealthConstants.TIMEBASE_PART_DIVIDER));
  }

  public static int getUnreversedRowKeyTimePart(long millis) {
    long seconds = millis / EhealthConstants.TIMEBASE_PRECISION_DIVIDER;
    return (int) (seconds / EhealthConstants.TIMEBASE_PART_DIVIDER);
  }

  /**
   * Returns the column part of the timestamp in seconds.
   * 
   * @param millis extract the seconds up.
   * @return timestamp part
   */
  public static int getColumnTimePart(long millis) {
    long seconds = millis / EhealthConstants.TIMEBASE_PRECISION_DIVIDER;
    return (int) (seconds % EhealthConstants.TIMEBASE_PART_DIVIDER);
  }

  /**
   * Returns the compound object contains the converted timepart for the rowkey and the column field
   * 
   * @param millis epoch millies
   * @return
   */
  public static TimeParts getTimeParts(long millis) {
    long seconds = millis / EhealthConstants.TIMEBASE_PRECISION_DIVIDER;
    int rk = reverse((int) (seconds / EhealthConstants.TIMEBASE_PART_DIVIDER));
    int cp = (int) (seconds % EhealthConstants.TIMEBASE_PART_DIVIDER);
    return new TimeParts(rk, cp);
  }

  public static int reverse(int time) {
    return Integer.MAX_VALUE - time;
  }

  /**
   * Creates a {@link ZonedDateTime} from the input parts. Thee returned value is in second
   * precision
   * 
   * @param rowkeyPart unreversed timebase
   * @param columnPart second part of the timebase
   * @return
   */
  public static ZonedDateTime mergeTimeparts(int rowkeyPart, int columnPart) {
    return mergeTimeparts(rowkeyPart, columnPart, EhealthConstants.DEFAULT_BUDAPEST_ZONEID);
  }

  public static ZonedDateTime mergeTimeparts(ZonedDateTime date, int columnPart) {
    return mergeTimeparts(getUnreversedRowKeyTimePart(date.toInstant().toEpochMilli()), columnPart,
        EhealthConstants.DEFAULT_BUDAPEST_ZONEID);
  }

  public static byte[] getColumnQualifierFromCell(Cell cell) {
    return Bytes.copy(cell.getQualifierArray(), cell.getQualifierOffset(), cell.getQualifierLength());
  }

  public static byte[] getColumnValueFromCell(Cell cell) {
    return Bytes.copy(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength());
  }

  public static double getColumnValueFromCellAsDouble(Cell cell) {
    return Bytes.toDouble(getColumnValueFromCell(cell));
  }

  public static String getColumnValueFromCellAsString(Cell cell) {
    return Bytes.toString(getColumnValueFromCell(cell));
  }


  public static ZonedDateTime mergeTimeparts(int rowkeyPart, int columnPart, ZoneId zoneId) {
    long l = (long) rowkeyPart * EhealthConstants.TIMEBASE_PART_DIVIDER + (long) columnPart;
    Instant i = Instant.ofEpochSecond(l);
    return ZonedDateTime.ofInstant(i, zoneId);
  }

  /**
   * Dto class for time conversion. The divided timeparts stored in the respective fields. The
   * {@link TimeParts#rowkeyTimepart} is reversed.
   *
   */
  public static class TimeParts {
    private final int rowkeyTimepart;
    private final int columnTimepart;

    public TimeParts(int rowkeyPart, int columnPart) {
      this.rowkeyTimepart = rowkeyPart;
      this.columnTimepart = columnPart;
    }

    public int getRowkeyTimepart() {
      return rowkeyTimepart;
    }

    public int getColumnTimepart() {
      return columnTimepart;
    }

  }
}
