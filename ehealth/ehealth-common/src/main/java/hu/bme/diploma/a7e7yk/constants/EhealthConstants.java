package hu.bme.diploma.a7e7yk.constants;

import java.nio.charset.Charset;
import java.time.ZoneId;

public class EhealthConstants {
  public static final Charset UTF8_CHARSET = Charset.forName("UTF-8");
  public static final String RABBITMQ_SERVER_ADDR = "127.0.0.1";
  public static final int RABBITMQ_AMQP_PORT = 5672;
  public static final int RABBITMQ_MQTT_PORT = 1883;
  public static final String RABBITMQ_EXCHANGE_NAME = "ehealth.publish";
  public static final String RABBITMQ_QUEUE_NAME = "ehealthQueue";
  public static final boolean RABBITMQ_REQUEUE = false;
  public static final String RABBITMQ_SENDERSUBSCRIPTION_TEMPLATE = "mqtt-subscription-@senderId@qos1";
  public static final String RABBITMQ_SENDERSUBSCRIPTION_TEMPLATE_VAR1 = "@senderId@";
  public static final ZoneId DEFAULT_BUDAPEST_ZONEID = ZoneId.of("Europe/Budapest");
}
