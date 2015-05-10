package hu.bme.diploma.a7e7yk.storm.realtime;

import hu.bme.diploma.a7e7yk.dtos.AbstractRealtimeDto;
import hu.bme.diploma.a7e7yk.healthrules.DecisionSupport;
import hu.bme.diploma.a7e7yk.interfaces.nettosphere.IRealtimeMessageSender;
import hu.bme.diploma.a7e7yk.storm.realtime.nettosphere.server.NettoSphereServer;

import java.util.Set;

import org.atmosphere.cpr.AtmosphereFramework;
import org.atmosphere.cpr.AtmosphereResource;
import org.atmosphere.cpr.Broadcaster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RealtimeMessageBroker implements IRealtimeMessageSender {
  private static final Logger logger = LoggerFactory.getLogger(RealtimeMessageBroker.class);
  private static final RealtimeMessageBroker RTMB = new RealtimeMessageBroker();

  private final AtmosphereFramework fw;
  private final ObjectMapper mapper = new ObjectMapper();
  private final NettoSphereServer nettoServer;

  private RealtimeMessageBroker() {
    nettoServer = new NettoSphereServer();
    fw = nettoServer.getFramework();
    DecisionSupport.init(this);
  }

  public static RealtimeMessageBroker get() {
    return RTMB;
  }

  private Broadcaster getBroadcastById(Object observerId, boolean createIfNew) {
    return fw.getBroadcasterFactory().lookup(observerId, createIfNew);
  }

  @Override
  public void sendMessageToObservers(AbstractRealtimeDto data) {
    try {
      Broadcaster b = getBroadcastById(data.getSubjectId(), false);
      if (b != null) {
        String s = mapper.writeValueAsString(data);
        logger.debug("Sending the message {}", s);
        b.broadcast(s);
      }
    } catch (JsonProcessingException e) {
      e.printStackTrace();
      logger.error(null, e);
    }
  }

  public void addObserverToBroadcast(AtmosphereResource resource, Object observerId) {
    getBroadcastById(observerId, true).addAtmosphereResource(resource);
  }

  public void removeObserverFromBroadcast(AtmosphereResource resource, Set<Object> ids) {
    ids.stream().forEach(l -> removeObserverFromBroadcast(resource, l));
  }

  public void removeObserverFromBroadcast(AtmosphereResource resource, Object observerId) {
    fw.getBroadcasterFactory().lookup(observerId).removeAtmosphereResource(resource);
  }

  public void close() {
    nettoServer.close();
  }


}
