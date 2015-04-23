package hu.bme.diploma.a7e7yk.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.util.Bytes;

public class HbaseConstants {
  public static final TableName MDC_CONSTANTS_TABLENAME = TableName.valueOf("mdc_constants");
  public static final TableName MEASUREMENTS_TABLENAME = TableName.valueOf("measurements");
  public static final byte[] MEASUREMENTS_CF = "m".getBytes();
  public static final Configuration UBUNTU_LOCAL_CONF = HBaseConfiguration.create();
  private static final String UBUNTU_IP = "192.168.2.104";
  /**
   * From the epoch in seconds time 1 hour split point for rowkey and column field
   */
  public static final int BASE_PART_MODULUS = 3600;
  public static final String ROWKEY_SEPARATOR = "^";
  public static final byte[] ROWKEY_SEPARATOR_AS_BYTE = Bytes.toBytes("^");

  static {
    UBUNTU_LOCAL_CONF.set(HConstants.ZOOKEEPER_QUORUM, UBUNTU_IP);
  }
}
