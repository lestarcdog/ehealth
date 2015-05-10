package hu.bme.diploma.a7e7yk.interfaces.nettosphere;

import hu.bme.diploma.a7e7yk.dtos.AbstractRealtimeDto;

public interface IRealtimeMessageSender {
  /**
   * Sends the {@code data} as JSON object through websocket technology to the connected user
   * specified by the {@code userid}
   * 
   * @param data data to send
   */
  public void sendMessageToObservers(AbstractRealtimeDto data);
}
