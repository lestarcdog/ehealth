package hu.bme.diploma.a7e7yk.storm.nettosphere.handler;

import hu.bme.diploma.a7e7yk.dtos.CommandDto;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.atmosphere.config.service.WebSocketHandlerService;
import org.atmosphere.websocket.WebSocket;
import org.atmosphere.websocket.WebSocketHandler;
import org.atmosphere.websocket.WebSocketProcessor.WebSocketException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebSocketHandlerService(path = "/measurements")
public class RealTimeDataWebSocketHandler implements WebSocketHandler {

  private static final Logger logger = LoggerFactory.getLogger(RealTimeDataWebSocketHandler.class);

  private final Set<String> subscriptionIds = new HashSet<>();
  private final ObjectMapper mapper = new ObjectMapper();
  private Object observerId = null;

  @Override
  public void onByteMessage(WebSocket webSocket, byte[] data, int offset, int length)
      throws IOException {}

  @Override
  public void onTextMessage(WebSocket webSocket, String data) {
    try {
      CommandDto command = mapper.readValue(data, CommandDto.class);
      switch (command.getCommand()) {
        case SUBSCRIBE:
          subscriptionIds.add(command.getValue());
          WebSocketRegistry.get().addObserverToBroadcast(webSocket.resource(), command.getValue());
          logger.debug("command called: {}", command);
          break;
        case UNSUBSCRIBE:
          subscriptionIds.remove(command.getValue());
          WebSocketRegistry.get().removeObserverFromBroadcast(webSocket.resource(),
              command.getValue());
          logger.debug("command called: {}", command);
          break;
        default:
          logger.warn("unspecified command: {}", command.getCommand());
          break;
      }
    } catch (IOException e) {
      logger.warn("Cannot parse incoming message: {} from {}@{}", data, webSocket.resource()
          .getRequest().getLocalAddr(), observerId);
    }


  }

  @Override
  public void onOpen(WebSocket webSocket) {
    // String jwtToken =
    // webSocket.resource().getRequest().getHeader(EhealthConstants.AUTH_TOKEN_HEADER_NAME);
    // try {
    // observerId = JwtTokenConverter.validateJwtToken(jwtToken);
    // } catch (EhealthException e) {
    // logger.warn("Authentication error", e);
    // try {
    // webSocket.resource().close();
    // } catch (IOException e1) {
    // }
    // }
    logger.info("WebSocket is connected for user {}", observerId.toString());
  }

  @Override
  public void onClose(WebSocket webSocket) {
    if (!subscriptionIds.isEmpty()) {
      WebSocketRegistry.get().removeObserverFromBroadcast(webSocket.resource(), subscriptionIds);
      subscriptionIds.clear();
    }
  }

  @Override
  public void onError(WebSocket webSocket, WebSocketException t) {
    logger.error("Websocket error", t);
  }

}
