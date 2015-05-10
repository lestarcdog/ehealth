package hu.bme.diploma.a7e7yk.storm.realtime.nettosphere.handler;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.converters.JwtTokenConverter;
import hu.bme.diploma.a7e7yk.dtos.CommandDto;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;
import hu.bme.diploma.a7e7yk.storm.realtime.RealtimeMessageBroker;

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
public class RealtimeDataWebSocketHandler implements WebSocketHandler {

  private static final Logger logger = LoggerFactory.getLogger(RealtimeDataWebSocketHandler.class);

  private final Set<String> subscriptionIds = new HashSet<>();
  private final ObjectMapper mapper = new ObjectMapper();
  private String observerId = null;

  @Override
  public void onByteMessage(WebSocket webSocket, byte[] data, int offset, int length)
      throws IOException {}

  @Override
  public void onTextMessage(WebSocket webSocket, String data) {
    logger.debug("Websocket message: {}", data);
    try {
      CommandDto command = mapper.readValue(data, CommandDto.class);
      switch (command.getCommand()) {
        case SUBSCRIBE:
          subscriptionIds.add(command.getValue());
          RealtimeMessageBroker.get().addObserverToBroadcast(webSocket.resource(),
              command.getValue());
          logger.debug("command called: {}", command);
          break;
        case UNSUBSCRIBE:
          subscriptionIds.remove(command.getValue());
          RealtimeMessageBroker.get().removeObserverFromBroadcast(webSocket.resource(),
              command.getValue());
          logger.debug("command called: {}", command);
          break;
        default:
          logger.warn("unspecified command: {}", command.getCommand());
          break;
      }
    } catch (IOException e) {
    }


  }

  @Override
  public void onOpen(WebSocket webSocket) {
    String jwtToken =
        webSocket.resource().getRequest().getHeader(EhealthConstants.AUTH_TOKEN_HEADER_NAME);
    logger.debug("Auth token: {}", jwtToken);
    try {
      observerId = JwtTokenConverter.validateJwtToken(jwtToken).getSubject();
    } catch (EhealthException e) {
      logger.warn("Authentication error", e);
      try {
        webSocket.resource().close();
        return;
      } catch (IOException e1) {
      }
    }
    logger.debug("On open from {}", observerId);
  }

  @Override
  public void onClose(WebSocket webSocket) {
    if (!subscriptionIds.isEmpty()) {
      RealtimeMessageBroker.get()
          .removeObserverFromBroadcast(webSocket.resource(), subscriptionIds);
      subscriptionIds.clear();
    }
  }

  @Override
  public void onError(WebSocket webSocket, WebSocketException t) {
    // logger.error("Websocket error", t);
  }

}
