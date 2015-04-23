package hu.bme.diploma.a7e7yk.dao;

import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorVitalSign;

import java.io.IOException;

import org.apache.hadoop.hbase.client.Put;

public class MeasurementsDao {
  private HbaseCommonDao commonDao;

  public MeasurementsDao() throws IOException {
    commonDao = new HbaseCommonDao();
  }

  public void persistMeasurement(String userId, ActivityMonitorVitalSign vitalSign) {
    Put p = new Put(HbaseDaoHelper.getRowKeyForMeasurements(userId, vitalSign));

  }

}
