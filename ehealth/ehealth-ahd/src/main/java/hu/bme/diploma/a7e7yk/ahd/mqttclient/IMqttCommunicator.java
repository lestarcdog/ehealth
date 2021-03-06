package hu.bme.diploma.a7e7yk.ahd.mqttclient;



public interface IMqttCommunicator {
  /**
   * Sends the message to the JMS server
   * 
   * @param message message to send
   * @throws Exception
   */
  public void sendMessage(byte[] message) throws Exception;

  /**
   * Close the connection and resources.
   */
  public void disconnect();

  /**
   * Returns the received bytes from the subscription.
   * 
   * @return received bytes
   */
  public byte[] receive();

  /**
   * Returns the Id of the sender who is connects to the server
   * 
   * @return Id of the sender
   */
  public String getSenderId();

}
