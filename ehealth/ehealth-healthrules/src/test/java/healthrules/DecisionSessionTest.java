package healthrules;

import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;
import hu.bme.diploma.a7e7yk.healthrules.DecisionSession;
import hu.bme.diploma.a7e7yk.healthrules.DecisionSupport;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class DecisionSessionTest {

  @Test
  public void createSessionWithBloodPressure() throws EhealthException {
    DecisionSupport supp = DecisionSupport.get();
    DecisionSession s = supp.getSession("jozsi", null);
    Assert.assertNotNull(s);

    BloodPressureVitalSign vs = new BloodPressureVitalSign();
    vs.getSystolic().setValue(120.5);
    vs.getDiastolic().setValue(99.2);
    vs.getPulseRate().setValue(72.0);

    s.addVitalSigns(Arrays.asList(vs));
  }
}
