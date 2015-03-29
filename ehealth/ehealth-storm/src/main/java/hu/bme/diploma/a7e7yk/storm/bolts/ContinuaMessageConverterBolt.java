package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMqSpout;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import storm.trident.operation.BaseFunction;
import storm.trident.operation.TridentCollector;
import storm.trident.operation.TridentOperationContext;
import storm.trident.tuple.TridentTuple;
import backtype.storm.tuple.Fields;
import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;
import ca.uhn.hl7v2.parser.Parser;

public class ContinuaMessageConverterBolt extends BaseFunction {

  private static final long serialVersionUID = 2269618342384875116L;
  private static final Logger LOG = LoggerFactory.getLogger(ContinuaMessageConverterBolt.class);
  public static final String USER_ID_FIELD = "userId";
  public static final String MEASUREMENTS_FIELD = "measurements";
  public static final String RETURN_MESSAGE_FIELD = "returnMessage";
  public static final Fields OUTPUT_FIELDS = new Fields(USER_ID_FIELD, MEASUREMENTS_FIELD,
      RETURN_MESSAGE_FIELD);
  private static final String INPUT_MSG_FIELD = RabbitMqSpout.OUTPUT_FIELDS.get(0);

  private Parser parser;
  private HapiContext ctx;
  private int i = 0;

  @Override
  public void execute(TridentTuple tuple, TridentCollector collector) {
    String msgTxt = (String) tuple.getStringByField(INPUT_MSG_FIELD);
    ORU_R01 message = new ORU_R01();
    try {
      parser.parse(message, msgTxt);
      collector.emit(Arrays.asList(i++, "measurement:valami érték"));
    } catch (HL7Exception e) {
      LOG.info(null, e);
      return;
    }

  }

  @Override
  public void cleanup() {
    try {
      ctx.close();
    } catch (IOException e) {
      LOG.error("Failed to close hapi context", e);
    }
    super.cleanup();
  }

  @Override
  public void prepare(Map conf, TridentOperationContext context) {
    ctx = new DefaultHapiContext();
    parser = ctx.getPipeParser();
    super.prepare(conf, context);
  }



}
