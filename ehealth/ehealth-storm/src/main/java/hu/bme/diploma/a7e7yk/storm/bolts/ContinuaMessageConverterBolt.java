package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMqSpout;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import storm.trident.operation.BaseFunction;
import storm.trident.operation.TridentCollector;
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
  public static final Fields OUTPUT_FIELDS_OK = new Fields("userId", "measurements");
  public static final Fields OUTPUT_FIELDS_ERROR = new Fields("userId", "error");
  private static final String INPUT_MSG_FIELD = RabbitMqSpout.OUTPUT_FIELDS.get(0);

  private final Parser parser;
  private final HapiContext ctx;

  public ContinuaMessageConverterBolt() {
    ctx = new DefaultHapiContext();
    parser = ctx.getPipeParser();
  }

  @Override
  public void execute(TridentTuple tuple, TridentCollector collector) {
    String msgTxt = (String) tuple.getStringByField(INPUT_MSG_FIELD);
    ORU_R01 message = new ORU_R01();
    try {
      parser.parse(message, msgTxt);

    } catch (HL7Exception e) {
      LOG.info(null, e);
      // TODO send response bolt
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



}
