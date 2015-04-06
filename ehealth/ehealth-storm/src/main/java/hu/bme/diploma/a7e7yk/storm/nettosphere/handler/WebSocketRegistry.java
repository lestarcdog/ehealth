package hu.bme.diploma.a7e7yk.storm.nettosphere.handler;

import hu.bme.diploma.a7e7yk.storm.nettosphere.data.RealTimeDataDto;

import java.util.Set;

import org.atmosphere.cpr.AtmosphereFramework;
import org.atmosphere.cpr.AtmosphereResource;
import org.atmosphere.cpr.Broadcaster;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WebSocketRegistry {
  private static WebSocketRegistry wsr = null;
  private final AtmosphereFramework fw;
  private ObjectMapper mapper = new ObjectMapper();

  private WebSocketRegistry(AtmosphereFramework fw) {
    this.fw = fw;
  }

  public void init(AtmosphereFramework fw) {
    wsr = new WebSocketRegistry(fw);
  }

  public static WebSocketRegistry get() {
    if (wsr == null) {
      throw new RuntimeException("WebSocketRegistry is not initialized");
    }
    return wsr;
  }

  private Broadcaster getBroadcastById(String id) {
    return fw.getBroadcasterFactory().lookup(id, true);
  }

  public void sendMessageToId(RealTimeDataDto data, String id) {
    String s = "";
    getBroadcastById(id).broadcast(s);
  }

  public void addSubsriberToBroadcast(AtmosphereResource resource, String id) {
    getBroadcastById(id).addAtmosphereResource(resource);
  }

  public void removeSubscriberFromBroadcast(AtmosphereResource resource, Set<String> ids) {
    ids.stream().forEach(l -> removeSubscriberFromBroadcast(resource, l));
  }

  public void removeSubscriberFromBroadcast(AtmosphereResource resource, String id) {
    fw.getBroadcasterFactory().lookup(id).removeAtmosphereResource(resource);
  }


}
