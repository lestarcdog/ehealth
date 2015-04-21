package hu.bme.diploma.a7e7yk.hbase;

import java.io.IOException;

import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.ConnectionFactory;


public class SchemaGenerator {


  public SchemaGenerator() {

  }

  private void createMdcConstantsTable() throws IOException {
    Admin admin = ConnectionFactory.createConnection().getAdmin();
  }
}
