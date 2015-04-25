package hu.bme.diploma.a7e7yk.constants;

import java.nio.charset.Charset;
import java.security.Key;
import java.time.ZoneId;

import org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers;
import org.jose4j.jwe.KeyManagementAlgorithmIdentifiers;
import org.jose4j.keys.AesKey;

public class EhealthConstants {
  public static final Charset UTF8_CHARSET = Charset.forName("UTF-8");
  public static final String RABBITMQ_SERVER_ADDR = "127.0.0.1";
  public static final int RABBITMQ_AMQP_PORT = 5672;
  public static final int RABBITMQ_MQTT_PORT = 1883;
  public static final String RABBITMQ_EXCHANGE_NAME = "ehealth.publish";
  public static final String RABBITMQ_QUEUE_NAME = "ehealthQueue";
  public static final boolean RABBITMQ_REQUEUE = false;
  public static final String RABBITMQ_SENDERSUBSCRIPTION_TEMPLATE =
      "mqtt-subscription-@senderId@qos1";
  public static final String RABBITMQ_SENDERSUBSCRIPTION_TEMPLATE_VAR1 = "@senderId@";
  public static final ZoneId DEFAULT_BUDAPEST_ZONEID = ZoneId.of("Europe/Budapest");
  /**
   * From the epoch in seconds time 1 hour split point for rowkey and column field
   */
  public static final long TIMEBASE_PART_DIVIDER = 3600;
  public static final long TIMEBASE_PRECISION_DIVIDER = 1000;

  // ----- JWT TOKEN----
  public static final int JWT_EXPIRATION_TIME = 30;
  public static final Key JWT_KEY = new AesKey("bullshitbullshit".getBytes());
  public static final String JWT_KEY_MANAGEMENT_ALGORITHM =
      KeyManagementAlgorithmIdentifiers.A128KW;
  public static final String JWT_CONTENT_ENCRYPTION_ALGORITHM =
      ContentEncryptionAlgorithmIdentifiers.AES_128_CBC_HMAC_SHA_256;
}
