package hu.bme.diploma.a7e7yk.healthrules;

import hu.bme.diploma.a7e7yk.interfaces.nettosphere.IRealtimeMessageSender;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.runtime.KieContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecisionSupport {

  private static DecisionSupport instance;
  private static final Logger logger = LoggerFactory.getLogger(DecisionSupport.class);

  private KieBase kbase;
  private Map<String, DecisionSession> registry = new HashMap<>();
  private RealtimeDecisionNotifyer notifier;

  private DecisionSupport(IRealtimeMessageSender messageSender) {
    KieBaseConfiguration kconf = KieServices.Factory.get().newKieBaseConfiguration();
    kconf.setOption(EventProcessingOption.STREAM);

    KieContainer container = KieServices.Factory.get().getKieClasspathContainer();
    kbase = container.newKieBase(kconf);

    notifier = new RealtimeDecisionNotifyer(messageSender);
  }

  public static DecisionSupport get() {
    if (instance == null) {
      throw new RuntimeException("Init method is not called");
    }
    return instance;
  }

  public DecisionSession getSession(String userId) {
    DecisionSession s = registry.get(userId);
    if (s == null) {
      logger.debug("Creating KieSession for {}", userId);
      s = new DecisionSession(kbase.newKieSession(), userId, notifier);
      registry.put(userId, s);
    }
    return s;
  }

  public void dispose(Object userId) {
    registry.get(userId).dispose();
  }

  public static synchronized void init(IRealtimeMessageSender messageSender) {
    logger.info("Init DecisionSupport");
    instance = new DecisionSupport(messageSender);
  }

}
