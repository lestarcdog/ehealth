package hu.bme.diploma.a7e7yk.hbase.schemagen;

import hu.bme.diploma.a7e7yk.hbase.HbaseConstants;

import java.io.IOException;

import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.TableNotFoundException;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Schemagenerator {

  private static final Logger logger = LoggerFactory.getLogger(Schemagenerator.class);

  public static void createMeasurements(TableName tableName) {
    try {
      try (Admin admin = ConnectionFactory.createConnection(HbaseConstants.UBUNTU_LOCAL_CONF).getAdmin()) {
        logger.info("Deleting table {}", tableName.getNameAsString());
        if (admin.tableExists(tableName)) {
          admin.disableTable(tableName);
          admin.deleteTable(tableName);
        }
        HTableDescriptor tableDescriptor = new HTableDescriptor(tableName);
        HColumnDescriptor column = new HColumnDescriptor(HbaseConstants.MEASUREMENTS_CF);
        column.setMaxVersions(1);
        column.setMinVersions(0);
        tableDescriptor.addFamily(column);
        logger.info("Creating table {}", tableName.getNameAsString());
        admin.createTable(tableDescriptor);
      }
    } catch (TableNotFoundException e) {
      logger.error("table not found", e);
    } catch (IOException e) {
      logger.error("ioexception", e);
    }
  }
}
