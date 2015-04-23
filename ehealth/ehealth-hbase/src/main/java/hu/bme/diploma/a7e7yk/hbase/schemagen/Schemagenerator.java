package hu.bme.diploma.a7e7yk.hbase.schemagen;

import hu.bme.diploma.a7e7yk.hbase.HbaseConstants;

import java.io.IOException;

import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableNotFoundException;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Schemagenerator {

  private static final Logger logger = LoggerFactory.getLogger(Schemagenerator.class);

  public void createMeasurements() {
    try {
      try (Admin admin = ConnectionFactory.createConnection(HbaseConstants.UBUNTU_LOCAL_CONF).getAdmin()) {
        logger.info("Deleting table {}", HbaseConstants.MEASUREMENTS_TABLENAME.getNameAsString());
        if (admin.tableExists(HbaseConstants.MEASUREMENTS_TABLENAME)) {
          admin.disableTable(HbaseConstants.MEASUREMENTS_TABLENAME);
          admin.deleteTable(HbaseConstants.MEASUREMENTS_TABLENAME);
        }
        HTableDescriptor tableDescriptor = new HTableDescriptor(HbaseConstants.MEASUREMENTS_TABLENAME);
        HColumnDescriptor column = new HColumnDescriptor(HbaseConstants.MEASUREMENTS_CF);
        tableDescriptor.addFamily(column);
        logger.info("Creating table {}", HbaseConstants.MEASUREMENTS_TABLENAME.getNameAsString());
        admin.createTable(tableDescriptor);
      }
    } catch (TableNotFoundException e) {
      logger.error("table not found", e);
    } catch (IOException e) {
      logger.error("ioexception", e);
    }
  }
}
