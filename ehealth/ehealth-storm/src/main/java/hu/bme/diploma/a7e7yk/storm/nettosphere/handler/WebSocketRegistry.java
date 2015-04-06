package hu.bme.diploma.a7e7yk.storm.nettosphere.handler;

import hu.bme.diploma.a7e7yk.storm.nettosphere.data.RealTimeDataDto;

import java.util.Set;

import org.atmosphere.cpr.AtmosphereFramework;
import org.atmosphere.cpr.AtmosphereResource;
import org.atmosphere.cpr.Broadcaster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WebSocketRegistry {
  private static final Logger logger = LoggerFactory.getLogger(WebSocketRegistry.class);
  private static WebSocketRegistry wsr = null;
  private final AtmosphereFramework fw;
  private ObjectMapper mapper = new ObjectMapper();

  private WebSocketRegistry(AtmosphereFramework fw) {
    this.fw = fw;
  }

  public static void init(AtmosphereFramework fw) {
    wsr = new WebSocketRegistry(fw);
  }

  public static WebSocketRegistry get() {
    if (wsr == null) {
      throw new RuntimeException("WebSocketRegistry is not initialized");
    }
    return wsr;
  }

  private Broadcaster getBroadcastById(String id, boolean createIfNew) {
    return fw.getBroadcasterFactory().lookup(id, createIfNew);
  }

  public void sendMessageToId(RealTimeDataDto data, String id) {
    try {
      String s = mapper.writeValueAsString(data);
      logger.info(s);
      Broadcaster b = getBroadcastById(id, false);
      if (b != null) {
        b.broadcast(s);
      }
    } catch (JsonProcessingException e) {
      e.printStackTrace();
      logger.error(null, e);
    }
  }

  public void addSubsriberToBroadcast(AtmosphereResource resource, String id) {
    getBroadcastById(id, true).addAtmosphereResource(resource);
  }

  public void removeSubscriberFromBroadcast(AtmosphereResource resource, Set<String> ids) {
    ids.stream().forEach(l -> removeSubscriberFromBroadcast(resource, l));
  }

  public void removeSubscriberFromBroadcast(AtmosphereResource resource, String id) {
    fw.getBroadcasterFactory().lookup(id).removeAtmosphereResource(resource);
  }


}
