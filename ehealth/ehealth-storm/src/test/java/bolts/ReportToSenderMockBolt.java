package bolts;

import hu.bme.diploma.a7e7yk.converter.hl7converter.HapiHl7Parser;
import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;

public class ReportToSenderMockBolt extends BaseRichBolt {
  private static final long serialVersionUID = 6431541012110777124L;

  private final Logger logger = LoggerFactory.getLogger(ReportToSenderMockBolt.class);

  private OutputCollector collector;
  private HapiHl7Parser parser;

  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    this.collector = collector;

  }

  @Override
  public void execute(Tuple input) {
    collector.ack(input);
    Object errorObject = input.getValueByField(StormFieldsConstants.ERROR_FIELD);
    String senderId = (String) input.getValueByField(StormFieldsConstants.SENDER_ID_FIELD);
    ORU_R01 parsedData = (ORU_R01) input.getValueByField(StormFieldsConstants.PARSED_CONTINUA_MSG_FIELD);
    try {
      if (errorObject == null && parsedData != null) {
        logger.info("Report to user no error");
      } else {
        HL7Exception exception = (HL7Exception) errorObject;
        logger.info("Report to user error");
      }
    } catch (Exception e) {
      logger.error("Can't send message to user", e);
    }
  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {}

  @Override
  public void cleanup() {
    super.cleanup();
  }

}
