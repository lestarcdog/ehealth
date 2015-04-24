package dao;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.dao.HbaseDaoHelper;
import hu.bme.diploma.a7e7yk.dao.HbaseDaoHelper.TimeParts;

import java.time.Instant;
import java.time.ZonedDateTime;

import org.junit.Assert;
import org.junit.Test;

public class HbaseDaoHelperTest {

  @Test
  public void timeMapping() {
    ZonedDateTime d = ZonedDateTime.now();
    d =
        ZonedDateTime.ofInstant(Instant.ofEpochSecond(d.toInstant().toEpochMilli() / 1000),
            EhealthConstants.DEFAULT_BUDAPEST_ZONEID);
    TimeParts tp = HbaseDaoHelper.getTimeParts(d.toInstant().toEpochMilli());
    int rk = HbaseDaoHelper.reverse(tp.getRowkeyTimepart());
    ZonedDateTime d2 = HbaseDaoHelper.mergeTimeparts(rk, tp.getColumnTimepart());
    Assert.assertEquals(d, d2);
  }
}
