package hu.bme.diploma.a7e7yk.ahd.runtime;

import java.net.URISyntaxException;

import org.fusesource.mqtt.client.MQTT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MqttSender {
  private final Logger _l = LoggerFactory.getLogger(getClass());
  private final static String host = "";
  private final static int port = 9800;

  private String username;
  private String password;

  public MqttSender() {
    MQTT mqtt = new MQTT();
    try {
      mqtt.setHost(host, port);
    } catch (URISyntaxException e) {
      _l.error(null, e);
    }
  }



  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
