package hu.bme.diploma.a7e7yk.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.TableName;

public class HbaseConstants {
  public static final TableName MDC_CONSTANTS_TABLENAME = TableName.valueOf("MDC_CONSTANTS");
  public static final TableName MEASUREMENTS_TABLENAME = TableName.valueOf("MEASUREMENTS");
  public static final byte[] MEASUREMENTS_CF = "m".getBytes();
  public static final Configuration UBUNTU_LOCAL_CONF = HBaseConfiguration.create();
  private static final String UBUNTU_IP = "192.168.2.104";

  static {
    UBUNTU_LOCAL_CONF.set(HConstants.ZOOKEEPER_QUORUM, UBUNTU_IP);
  }
}
