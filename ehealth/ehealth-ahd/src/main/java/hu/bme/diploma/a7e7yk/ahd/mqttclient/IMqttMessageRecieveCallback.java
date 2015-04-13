package hu.bme.diploma.a7e7yk.ahd.mqttclient;

import org.fusesource.hawtbuf.Buffer;

public interface IMqttMessageRecieveCallback {

  /**
   * On message received this method is called. Usually UTF8Buffer with string data.
   * 
   * @param message The message which is received
   */
  public void receive(Buffer message);
}
