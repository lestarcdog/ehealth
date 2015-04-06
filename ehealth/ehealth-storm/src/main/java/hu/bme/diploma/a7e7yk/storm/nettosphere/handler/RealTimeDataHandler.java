package hu.bme.diploma.a7e7yk.storm.nettosphere.handler;

import java.io.IOException;

import org.atmosphere.config.service.AtmosphereHandlerService;
import org.atmosphere.cpr.AtmosphereHandler;
import org.atmosphere.cpr.AtmosphereResource;
import org.atmosphere.cpr.AtmosphereResourceEvent;

@AtmosphereHandlerService(path = "/test")
public class RealTimeDataHandler implements AtmosphereHandler {

  @Override
  public void onRequest(AtmosphereResource resource) throws IOException {
    resource.getResponse().write("Hello World").flushBuffer();
    // resource.getBroadcaster().addAtmosphereResource(resource);
    System.err.println("OnRequest: " + resource.uuid());
    resource.suspend();

  }

  @Override
  public void onStateChange(AtmosphereResourceEvent event) throws IOException {
    System.err.println("Message: " + event.getMessage().toString());
    System.err.println("onStateChange: " + event.getResource().uuid());
    event.getResource().getResponse().write("onStateChange").flushBuffer();
  }

  @Override
  public void destroy() {
    // TODO Auto-generated method stub

  }



}
