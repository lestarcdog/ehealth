package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSignValue;
import hu.bme.diploma.a7e7yk.hl7conversion.Hl7MessageConverter;
import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;
import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;
import ca.uhn.hl7v2.parser.Parser;

public class ContinuaMessageConverterBolt extends BaseRichBolt {

  private static final Logger LOG = LoggerFactory.getLogger(ContinuaMessageConverterBolt.class);

  public static final Fields OUTPUT_FIELDS = new Fields(StormFieldsConstants.SENDER_ID_FIELD,
      StormFieldsConstants.USER_ID_FIELD, StormFieldsConstants.MEASUREMENTS_FIELD, StormFieldsConstants.ERROR_FIELD);

  private Parser parser;
  private HapiContext ctx;
  private OutputCollector collector;

  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    this.collector = collector;
    ctx = new DefaultHapiContext();
    parser = ctx.getPipeParser();
  }

  @Override
  public void execute(Tuple input) {
    String msgTxt = (String) input.getStringByField(StormFieldsConstants.CONTINUA_MSG_FIELD);
    ORU_R01 message = new ORU_R01();
    try {
      parser.parse(message, msgTxt);
      PersonModel personModel = Hl7MessageConverter.getPersonModel(message);
      List<AbstractVitalSignValue> vitalValues = Hl7MessageConverter.getVitalSignValues(message);
      String senderId = input.getStringByField(StormFieldsConstants.SENDER_ID_FIELD);
      collector.ack(input);
      collector.emit(input, new Values(senderId, personModel.getSsn(), vitalValues, null));
    } catch (HL7Exception e) {
      LOG.info(null, e);
      collector.emit(Arrays.asList());
      return;
    }


  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {
    declarer.declare(OUTPUT_FIELDS);

  }

}
