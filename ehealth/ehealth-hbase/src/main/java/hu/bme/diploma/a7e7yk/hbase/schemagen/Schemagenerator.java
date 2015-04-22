package hu.bme.diploma.a7e7yk.hbase.schemagen;

import hu.bme.diploma.a7e7yk.hbase.HbaseConstants;

import java.io.IOException;

import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.ConnectionFactory;

public class Schemagenerator {

  public void createMeasurements() throws IOException {
    try (Admin admin = ConnectionFactory.createConnection(HbaseConstants.UBUNTU_LOCAL_CONF).getAdmin()) {
      HTableDescriptor measurementDescriptor = admin.getTableDescriptor(HbaseConstants.MEASUREMENTS_TABLENAME);
      measurementDescriptor.addFamily(measurementDescriptor.getFamily(HbaseConstants.MEASUREMENTS_CF));
      admin.createTable(measurementDescriptor);
    }

  }
}
