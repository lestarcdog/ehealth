package hu.bme.diploma.a7e7yk.storm.nettosphere.handler;

import hu.bme.diploma.a7e7yk.dtos.RealTimeDataDto;

import java.util.Set;

import org.atmosphere.cpr.AtmosphereFramework;
import org.atmosphere.cpr.AtmosphereResource;
import org.atmosphere.cpr.Broadcaster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WebSocketRegistry implements IRealtimeMessageSender {
  private static final Logger logger = LoggerFactory.getLogger(WebSocketRegistry.class);
  private static WebSocketRegistry wsr = null;
  private final AtmosphereFramework fw;
  private ObjectMapper mapper = new ObjectMapper();

  private WebSocketRegistry(AtmosphereFramework fw) {
    this.fw = fw;
  }

  public synchronized static void init(AtmosphereFramework fw) {
    wsr = new WebSocketRegistry(fw);
  }

  public static WebSocketRegistry get() {
    if (wsr == null) {
      throw new RuntimeException("WebSocketRegistry is not initialized");
    }
    return wsr;
  }

  private Broadcaster getBroadcastById(Object observerId, boolean createIfNew) {
    return fw.getBroadcasterFactory().lookup(observerId, createIfNew);
  }

  @Override
  public void sendMessageToObservers(RealTimeDataDto data) {
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


}
