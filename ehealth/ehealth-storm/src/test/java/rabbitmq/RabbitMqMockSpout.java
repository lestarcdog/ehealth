package rabbitmq;

import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMqSpout;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;

public class RabbitMqMockSpout extends BaseRichSpout {

  List<String> tuples =
      Arrays
          .asList("MSH|^~\\&|Cdog Health Ltd.^6CF049DB5F02^EUI-64||||20150118143000+0000||ORU^R01^ORU_R01|msgId0|T|2.6|||NE|AL|||||IHE PCD ORU-R012006^HL7^2.16.840.1.113883.9^HL7 "
              + " PID|||SSN3456789^^^&OEP^SSN||Lófasz^János||19910120150657.05+0100"
              + " OBR|1|AB1234^Cdog Health Ltd.^6CF049DB5F02^EUI-64|AB1234^Cdog Health Ltd.^6CF049DB5F02^EUI-64|135840009^Blood pressure monitoring^SNOMED-CT|||20150118143000+0000|20150118143100+0000"
              + " OBX|2||528391^MDC_DEV_SPEC_PROFILE_BP^MDC|1|||||||X|||20150118143000+0000||||0123456789ABCDEF^EUI-64"
              + " OBX|3||150020^MDC_PRESS_BLD_NONINV^MDC|1.0.1|||||||x|||20150118143000+0000"
              + " OBX|4|NM|150021^MDC_PRESS_BLD_NONINV_SYS^MDC|1.0.1.1|140.5|266016^MDC_DIM_MMHG^MDC|||||R|||20150118143000+0000"
              + " OBX|5|NM|150022^MDC_PRESS_BLD_NONINV_DIA^MDC|1.0.1.2|95.0|266016^MDC_DIM_MMHG^MDC|||||R|||20150118143000+0000"
              + " OBX|6|NM|149546^MDC_PULS_RATE_NON_INV^MDC|1.0.0.1|75.5|264864^MDC_DIM_BEAT_PER_MIN^MDC|||||R|||20150118143000+0000");
  SpoutOutputCollector collector;
  private Random rand;

  private int i = 0;

  @Override
  public void open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
    this.collector = collector;
    rand = new Random();
  }

  @Override
  public void nextTuple() {
    String s = tuples.get(rand.nextInt(tuples.size()));
    try {
      Thread.sleep(200);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    collector.emit(Arrays.asList(s));

  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {
    declarer.declare(RabbitMqSpout.OUTPUT_FIELDS);

  }

}
