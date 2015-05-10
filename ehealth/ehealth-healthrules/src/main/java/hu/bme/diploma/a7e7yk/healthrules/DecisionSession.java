package hu.bme.diploma.a7e7yk.healthrules;

import hu.bme.diploma.a7e7yk.converters.RealTimeDtoConverter;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.GlucoseVitalSign;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;
import hu.bme.diploma.a7e7yk.interfaces.healthrules.IRealtimeNotifyDecision;
import hu.bme.diploma.a7e7yk.interfaces.healthrules.RealtimeDecisionMessage;
import hu.bme.diploma.a7e7yk.interfaces.nettosphere.IRealtimeMessageSender;

import java.util.List;

import org.kie.api.runtime.KieSession;

public class DecisionSession {

  public static final String BP_EP = "bp-ep";
  public static final String ACM_EP = "acm-ep";
  public static final String GLC_EP = "gluc-ep";
  public static final String NOTIFY_SERVICE_ID = "notifyService";

  private final KieSession session;
  private final String subjectId;
  private final IRealtimeMessageSender messageSender;

  public DecisionSession(KieSession newKieSession, String subjectId,
      IRealtimeMessageSender messageSender) {
    session = newKieSession;
    this.subjectId = subjectId;
    this.messageSender = messageSender;
    session.setGlobal(NOTIFY_SERVICE_ID, new DecisionMessageModifier());
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

  private void addVitalSign(BloodPressureVitalSign vitalSign) {
    session.getEntryPoint(BP_EP).insert(vitalSign);
  }

  private void addVitalSign(ActivityMonitorVitalSign vitalSign) {
    session.getEntryPoint(ACM_EP).insert(vitalSign);
  }

  private void addVitalSign(GlucoseVitalSign vitalSign) {
    session.getEntryPoint(GLC_EP).insert(GLC_EP);
  }

  /**
   * Private class for modifing decision message.
   */
  private class DecisionMessageModifier implements IRealtimeNotifyDecision {
    @Override
    public void notify(RealtimeDecisionMessage msg) {
      msg.setSubjectId(subjectId);
      messageSender.sendMessageToObservers(RealTimeDtoConverter.convert2Decision(msg));
    }
  }
}
