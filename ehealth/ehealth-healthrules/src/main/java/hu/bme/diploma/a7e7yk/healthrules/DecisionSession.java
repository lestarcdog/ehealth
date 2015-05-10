package hu.bme.diploma.a7e7yk.healthrules;

import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;
import hu.bme.diploma.a7e7yk.interfaces.healthrules.IRealtimeDecision;

import java.util.List;

import org.kie.api.runtime.KieSession;

public class DecisionSession {

  private final KieSession session;
  public static final String BP_EP = "bp-ep";
  public static final String ACM_EP = "acm-ep";

  public DecisionSession(KieSession newKieSession, IRealtimeDecision callback) {
    session = newKieSession;
    session.setGlobal("callback", callback);
  }

  private void addVitalSign(BloodPressureVitalSign vitalSign) {
    session.getEntryPoint(BP_EP).insert(vitalSign);
  }

  private void addVitalSign(ActivityMonitorVitalSign vitalSign) {
    session.getEntryPoint(ACM_EP).insert(vitalSign);
  }

  public void dispose() {
    session.dispose();
  }

  public void addVitalSigns(List<AbstractVitalSign> signValues) throws EhealthException {
    for (AbstractVitalSign v : signValues) {
      if (v instanceof BloodPressureVitalSign) {
        addVitalSign((BloodPressureVitalSign) v);

      } else if (v instanceof ActivityMonitorVitalSign) {
        addVitalSign((ActivityMonitorVitalSign) v);
      } else {
        throw new EhealthException("Undefined class " + v.getClass().getCanonicalName());
      }
    }
    session.fireAllRules();
  }

}
