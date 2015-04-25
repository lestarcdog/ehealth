package hu.bme.diploma.a7e7yk.storm.nettosphere.server;

import hu.bme.diploma.a7e7yk.dtos.RealTimeDataDto;
import hu.bme.diploma.a7e7yk.storm.nettosphere.handler.IRealtimeMessageSender;
import hu.bme.diploma.a7e7yk.storm.nettosphere.handler.RealTimeDataWsHandler;
import hu.bme.diploma.a7e7yk.storm.nettosphere.handler.WebSocketRegistry;

import org.atmosphere.nettosphere.Config;
import org.atmosphere.nettosphere.Nettosphere;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NettoSphereServer implements IRealtimeMessageSender {

  private static final Logger logger = LoggerFactory.getLogger(NettoSphereServer.class);
  private final Nettosphere server;

  public NettoSphereServer() {
    Config.Builder conf =
        new Config.Builder().host("127.0.0.1").port(9090).resource(RealTimeDataWsHandler.class);

    server = new Nettosphere.Builder().config(conf.build()).build();
    WebSocketRegistry.init(server.framework());
    server.start();
  }

  @Override
  public void sendMessageToId(RealTimeDataDto data, String userId) {
    WebSocketRegistry.get().sendMessageToId(data, userId);
  }

  public void close() {
    server.stop();
  }

}
