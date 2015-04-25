package hu.bme.diploma.a7e7yk.dao.hbase;

import hu.bme.diploma.a7e7yk.exceptions.EhealthException;
import hu.bme.diploma.a7e7yk.hbase.HbaseConstants;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Get;
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
  private final TableName measurementsTable;

  public HbaseCommonDao(TableName measurementsTable) throws IOException {
    this.measurementsTable = measurementsTable;
    connection = ConnectionFactory.createConnection(HbaseConstants.UBUNTU_LOCAL_CONF);
  }

  /**
   * Puts the data in the {@link HbaseConstants#MEASUREMENTS_TABLENAME} table
   * 
   * @param put data to insert
   * @throws EhealthException
   */
  public void putInMeasurementsTable(Put put) throws EhealthException {
    try (HTable table = (HTable) connection.getTable(measurementsTable)) {
      logger.debug("putting in measurement: {}", put);
      table.put(put);
    } catch (IOException e) {
      throw new EhealthException(e);
    }
  }

  /**
   * Puts the bulk data in the {@link HbaseConstants#MEASUREMENTS_TABLENAME} table
   * 
   * @param put data to insert
   * @throws EhealthException
   */
  public void putInMeasurementsTable(List<Put> puts) throws EhealthException {
    try (HTable table = (HTable) connection.getTable(measurementsTable)) {
      table.put(puts);
    } catch (IOException e) {
      throw new EhealthException(e);
    }
  }

  public List<Cell> getMeasurements(Get g) throws EhealthException {
    try (HTable table = (HTable) connection.getTable(measurementsTable)) {
      return table.get(g).listCells();
    } catch (IOException e) {
      throw new EhealthException(e);
    }
  }
}
