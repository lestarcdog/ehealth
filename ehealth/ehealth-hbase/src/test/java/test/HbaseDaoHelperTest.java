package test;

import hu.bme.diploma.a7e7yk.dao.HbaseDaoHelper;
import hu.bme.diploma.a7e7yk.dao.HbaseDaoHelper.TimeParts;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.GlucoseVitalSign;
import hu.bme.diploma.a7e7yk.hbase.HbaseConstants;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.apache.hadoop.hbase.util.Bytes;
import org.junit.Assert;
import org.junit.Test;

public class HbaseDaoHelperTest {

  // @Test
  public void conversion() {
    ZonedDateTime c = ZonedDateTime.now(ZoneId.of("Europe/Budapest"));
    long seconds = c.toInstant().toEpochMilli() / 1000;
    long mins = seconds / 60;
    long hours = mins / 60;
    System.out.println("Hours: " + hours % 24 + " Mins: " + mins % 60 + " Secs: " + seconds % 60);

    long millis = c.toInstant().toEpochMilli() / 1000;

    int base = (int) (millis / (3600));
    int hour = (int) (millis % (3600));
    System.out.println(millis);
    System.out.println("Base: " + base);
    System.out.println("Hour: " + hour);
  }

  @Test
  public void generateRowKey() {
    String userId = "TAJSZÁM123";
    TimeParts tp = HbaseDaoHelper.getTimeParts(System.currentTimeMillis());
    byte[] b = HbaseDaoHelper.getRowKeyForMeasurements(userId, tp.getRowkeyPart(), GlucoseVitalSign.MDC_VALUE.getId());

    int pos = Bytes.indexOf(b, HbaseConstants.ROWKEY_SEPARATOR_AS_BYTE);
    Assert.assertEquals(userId, Bytes.toString(Bytes.copy(b, 0, pos)));
    int pos2 = pos + HbaseConstants.ROWKEY_SEPARATOR_AS_BYTE.length;
    int rtb = Bytes.toInt(Bytes.copy(b, pos2, 4));
    int vid = Bytes.toInt(Bytes.copy(b, pos2 + 4, 4));

    Assert.assertEquals(tp.getRowkeyPart(), rtb);
    Assert.assertEquals(GlucoseVitalSign.MDC_VALUE.getId(), vid);
  }

  @Test
  public void generateColumnName() {
    GlucoseVitalSign v = new GlucoseVitalSign();
    TimeParts tp = HbaseDaoHelper.getTimeParts(System.currentTimeMillis());
    byte[] b =
        HbaseDaoHelper.getColumnNameForMeasurements(v.getGlucose().getType().getId(), tp.getColumnPart(), v
            .getGlucose().getUnit().getId());

    int valueId = Bytes.toInt(Bytes.copy(b, 0, 4));
    int timep = Bytes.toInt(Bytes.copy(b, 4, 4));
    int unitId = Bytes.toInt(Bytes.copy(b, 8, 4));
    Assert.assertEquals(v.getGlucose().getType().getId(), valueId);
    Assert.assertEquals(tp.getColumnPart(), timep);
    Assert.assertEquals(v.getGlucose().getUnit().getId(), unitId);
  }
}
