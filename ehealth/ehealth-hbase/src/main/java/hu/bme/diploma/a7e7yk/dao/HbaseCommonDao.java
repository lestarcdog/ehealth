package hu.bme.diploma.a7e7yk.dao;

import hu.bme.diploma.a7e7yk.hbase.HbaseConstants;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class for managing Hbase close data managments methods
 *
 */
public class HbaseCommonDao {

  private static final Logger logger = LoggerFactory.getLogger(HbaseCommonDao.class);

  private final Connection connection;

  public HbaseCommonDao() throws IOException {
    connection = ConnectionFactory.createConnection(HbaseConstants.UBUNTU_LOCAL_CONF);
  }

  /**
   * Puts the data in the {@link HbaseConstants#MEASUREMENTS_TABLENAME} table
   * 
   * @param put data to insert
   */
  public void putInMeasurementsTable(Put put) {
    try (HTable table = (HTable) connection.getTable(HbaseConstants.MEASUREMENTS_TABLENAME)) {
      table.put(put);
    } catch (IOException e) {
      logger.error(null, e);
    }
  }

  /**
   * Puts the bulk data in the {@link HbaseConstants#MEASUREMENTS_TABLENAME} table
   * 
   * @param put data to insert
   */
  public void putInMeasurementsTable(List<Put> puts) {
    try (HTable table = (HTable) connection.getTable(HbaseConstants.MEASUREMENTS_TABLENAME)) {
      table.put(puts);
    } catch (IOException e) {
      logger.error(null, e);
    }
  }
}
