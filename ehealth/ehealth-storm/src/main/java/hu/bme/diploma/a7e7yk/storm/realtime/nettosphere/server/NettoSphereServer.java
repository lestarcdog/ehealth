package hu.bme.diploma.a7e7yk.storm.realtime.nettosphere.server;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.storm.realtime.nettosphere.handler.RealtimeDataWebSocketHandler;

import org.atmosphere.cpr.AtmosphereFramework;
import org.atmosphere.nettosphere.Config;
import org.atmosphere.nettosphere.Nettosphere;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NettoSphereServer {

  private static final Logger logger = LoggerFactory.getLogger(NettoSphereServer.class);
  private final Nettosphere server;

  public NettoSphereServer() {
    Config.Builder conf =
        new Config.Builder().host(EhealthConstants.NETTOSPHERE_BIND_HOST)
            .port(EhealthConstants.NETTOSPHERE_BIND_PORT)
            .resource(RealtimeDataWebSocketHandler.class);

    server = new Nettosphere.Builder().config(conf.build()).build();
    server.start();
    logger.info("Nettosphere server started {}:{}", EhealthConstants.NETTOSPHERE_BIND_HOST,
        EhealthConstants.NETTOSPHERE_BIND_PORT);
  }

  public AtmosphereFramework getFramework() {
    return server.framework();
  }

  public void close() {
    server.stop();
  }

}
