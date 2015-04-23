package schemagen;

import hu.bme.diploma.a7e7yk.hbase.schemagen.Schemagenerator;

import org.junit.Test;

public class SchemagenTest {

  @Test
  public void createHbaseSchema() {
    Schemagenerator gen = new Schemagenerator();
    gen.createMeasurements();
  }
}
