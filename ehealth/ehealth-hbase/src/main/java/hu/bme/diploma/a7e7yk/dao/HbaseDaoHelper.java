package hu.bme.diploma.a7e7yk.dao;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.hbase.HbaseConstants;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

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
    long seconds = millis / 1000;
    return reverse((int) (seconds / HbaseConstants.BASE_PART_MODULUS));
  }

  /**
   * Returns the column part of the timestamp in seconds.
   * 
   * @param millis extract the seconds up.
   * @return timestamp part
   */
  public static int getColumnTimePart(long millis) {
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

  public static int reverse(int time) {
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
