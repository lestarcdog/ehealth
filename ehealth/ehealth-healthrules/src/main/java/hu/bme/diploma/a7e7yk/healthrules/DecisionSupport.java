package hu.bme.diploma.a7e7yk.healthrules;

import hu.bme.diploma.a7e7yk.interfaces.healthrules.IRealtimeDecision;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.runtime.KieContainer;

public class DecisionSupport {

  private KieBase kbase;
  private Map<Object, DecisionSession> registry = new HashMap<>();
  private static final DecisionSupport INSTANCE = new DecisionSupport();

  private DecisionSupport() {
    KieBaseConfiguration kconf = KieServices.Factory.get().newKieBaseConfiguration();
    kconf.setOption(EventProcessingOption.STREAM);

    KieContainer container = KieServices.Factory.get().getKieClasspathContainer();
    kbase = container.newKieBase(kconf);
  }

  public static DecisionSupport get() {
    return INSTANCE;
  }

  public DecisionSession getSession(Object userId, IRealtimeDecision callback) {
    DecisionSession s = registry.get(userId);
    if (s == null) {
      s = new DecisionSession(kbase.newKieSession(), callback);
      registry.put(userId, s);
    }
    return s;
  }

  public void dispose(Object userId) {
    registry.get(userId).dispose();
  }


}
