package hu.bme.diploma.a7e7yk.storm.nettosphere.handler;

import hu.bme.diploma.a7e7yk.storm.nettosphere.data.CommandDto;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.atmosphere.config.service.WebSocketHandlerService;
import org.atmosphere.websocket.WebSocket;
import org.atmosphere.websocket.WebSocketHandler;
import org.atmosphere.websocket.WebSocketProcessor.WebSocketException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebSocketHandlerService(path = "/measurements")
public class RealTimeDataWsHandler implements WebSocketHandler {

  private static final Logger logger = LoggerFactory.getLogger(RealTimeDataWsHandler.class);

  private final Set<String> subIds = new HashSet<>();
  private final ObjectMapper mapper = new ObjectMapper();

  @Override
  public void onByteMessage(WebSocket webSocket, byte[] data, int offset, int length)
      throws IOException {}

  @Override
  public void onTextMessage(WebSocket webSocket, String data) throws IOException {
    try {
      CommandDto command = mapper.readValue(data, CommandDto.class);
      switch (command.getCommand()) {
        case CommandDto.COMMAND_SUBSCRIBE:
          WebSocketRegistry.get().addSubsriberToBroadcast(webSocket.resource(), command.getValue());
          logger.info("command called: {}", command);
          break;
        case CommandDto.COMMAND_UNSUBSCRIBE:
          WebSocketRegistry.get().removeSubscriberFromBroadcast(webSocket.resource(),
              command.getValue());
          logger.info("command called: {}", command);
          break;
        default:
          logger.warn("unspecified command: {}", command.getCommand());
          break;
      }
    } catch (JsonParseException e) {
      logger.warn("unspecified message: {}", data);
    }


  }

  @Override
  public void onOpen(WebSocket webSocket) throws IOException {
    // TODO JWT token check validation
    logger.debug("WebSocket is connected {}", "no-name");
  }

  @Override
  public void onClose(WebSocket webSocket) {
    WebSocketRegistry.get().removeSubscriberFromBroadcast(webSocket.resource(), subIds);
    subIds.clear();
  }

  @Override
  public void onError(WebSocket webSocket, WebSocketException t) {
    logger.error("Websocket error", t);
  }

}
