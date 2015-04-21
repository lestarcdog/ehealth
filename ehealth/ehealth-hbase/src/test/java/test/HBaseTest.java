package test;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.Test;

public class HBaseTest {
  private static final String UBUNTU_IP = "192.168.2.104";
  private static final TableName TEST_TABLE = TableName.valueOf("test");
  private static final byte[] COLUMN_FAMILY = Bytes.toBytes("data");

  @Test
  public void test() {
    Configuration conf = HBaseConfiguration.create();
    conf.set(HConstants.ZOOKEEPER_QUORUM, UBUNTU_IP);
    try {
      Connection connection = ConnectionFactory.createConnection(conf);
      Table t = connection.getTable(TEST_TABLE);
      Put p = new Put("row99".getBytes());
      p.addColumn(COLUMN_FAMILY, "a".getBytes(), "value99".getBytes());
      t.put(p);

      Get g = new Get("row1".getBytes());
      Result r = t.get(g);
      System.out.println(r);

      // Scan s = new Scan();
      // ResultScanner res = t.getScanner(s);
      // Iterator<Result> it = res.iterator();
      // while (it.hasNext()) {
      // Result r = it.next();
      // System.out.println(r);
      // }
    } catch (Throwable e) {
      e.printStackTrace();
    }
  }

}
