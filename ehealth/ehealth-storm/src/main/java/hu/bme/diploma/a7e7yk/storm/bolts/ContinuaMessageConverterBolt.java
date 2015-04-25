package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.converters.hl7converter.HapiHl7Parser;
import hu.bme.diploma.a7e7yk.converters.hl7converter.Hl7MessageConverter;
import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
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
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;

public class ContinuaMessageConverterBolt extends BaseRichBolt {

  private static final long serialVersionUID = -6196295171565912992L;

  private static final Logger logger = LoggerFactory.getLogger(ContinuaMessageConverterBolt.class);

  public static final Fields OUTPUT_FIELDS = new Fields(StormFieldsConstants.SENDER_ID_FIELD,
      StormFieldsConstants.USER_ID_FIELD, StormFieldsConstants.MEASUREMENTS_FIELD, StormFieldsConstants.ERROR_FIELD,
      StormFieldsConstants.PARSED_CONTINUA_MSG_FIELD);

  private OutputCollector collector;
  private HapiHl7Parser parser;

  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    this.collector = collector;
    parser = new HapiHl7Parser();
  }

  @Override
  public void execute(Tuple input) {
    String msgTxt = (String) input.getStringByField(StormFieldsConstants.UNPARSED_CONTINUA_MSG_FIELD);
    String senderId = input.getStringByField(StormFieldsConstants.SENDER_ID_FIELD);
    logger.debug("converting message of {}", senderId);
    ORU_R01 message;
    try {
      message = parser.parseMessage(msgTxt);
      PersonModel personModel = Hl7MessageConverter.getPersonModel(message);
      List<AbstractVitalSign> vitalValues = Hl7MessageConverter.getVitalSignValues(message);

      collector.ack(input);
      // sender , personId, measurements, error, parsed hl7 msg
      collector.emit(input, new Values(senderId, personModel.getSsn(), vitalValues, null, message));
    } catch (HL7Exception e) {
      // throw to error to the next ErrorFilter bolt
      // and handle there
      collector.emit(Arrays.asList(senderId, null, null, e, null));
      return;
    }
  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {
    declarer.declare(OUTPUT_FIELDS);
  }

}
