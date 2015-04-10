package rabbitmq;

import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMqSpout;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;

public class RabbitMqMockSpout extends BaseRichSpout {
  private static final long serialVersionUID = -3644167402364354874L;

  List<String> tuples =
      Arrays
          .asList(
              "MSH|^~\\&|Cdog Health Ltd.^6CF049DB5F02^EUI-64||||20150118143000+0000||ORU^R01^ORU_R01|msgId0|T|2.6|||NE|AL|||||IHE PCD ORU-R012006^HL7^2.16.840.1.113883.9^HL7 "
                  + "\rPID|||SSN3456789^^^&OEP^SSN||Lofasz^Janos||19910120150657.05+0100"
                  + "\rOBR|1|AB1234^Cdog Health Ltd.^6CF049DB5F02^EUI-64|AB1234^Cdog Health Ltd.^6CF049DB5F02^EUI-64|135840009^Blood pressure monitoring^SNOMED-CT|||20150118143000+0000|20150118143100+0000"
                  + "\rOBX|2||528391^MDC_DEV_SPEC_PROFILE_BP^MDC|1|||||||X|||20150118143000+0000||||0123456789ABCDEF^EUI-64"
                  + "\rOBX|3||150020^MDC_PRESS_BLD_NONINV^MDC|1.0.1|||||||x|||20150118143000+0000"
                  + "\rOBX|4|NM|150021^MDC_PRESS_BLD_NONINV_SYS^MDC|1.0.1.1|140.5|266016^MDC_DIM_MMHG^MDC|||||R|||20150118143000+0000"
                  + "\rOBX|5|NM|150022^MDC_PRESS_BLD_NONINV_DIA^MDC|1.0.1.2|95.0|266016^MDC_DIM_MMHG^MDC|||||R|||20150118143000+0000"
                  + "\rOBX|6|NM|149546^MDC_PULS_RATE_NON_INV^MDC|1.0.0.1|75.5|264864^MDC_DIM_BEAT_PER_MIN^MDC|||||R|||20150118143000+0000",
              "MSH|^~\\&|Cdog Health Ltd.^6CF049DB5F02^EUI-64||||20150118143000+0000||ORU^R01^ORU_R01|msgId0|T|2.6|||NE|AL|||||IHE PCD ORU-R012006^HL7^2.16.840.1.113883.9^HL7"
                  + "\rPID|||SSN3456789^^^&OEP^SSN||Lofasz^Janos||19910120210400.806+0100"
                  + "\rOBR|1|AB1234^Cdog Health Ltd.^6CF049DB5F02^EUI-64|AB1234^Cdog Health Ltd.^6CF049DB5F02^EUI-64|359772000^Glucose monitoring at home^SNOMED-CT|||20150118143000+0000|20150118143100+0000"
                  + "\rOBX|2||528401^MDC_DEV_SPEC_PROFILE_GLUCOSE^MDC|1|||||||X|||20150118143000+0000||||0123456789ABCDEF^EUI-64"
                  + "\rOBX|3|NM|160184^MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD^MDC|1.0.0.1|6.5|264274^MDC_DIM_MILLI_G_PER_DL^MDC|||||R|||20150118143000+0000",
              "MSH|^~\\&|Cdog Health Ltd.^6CF049DB5F02^EUI-64||||20150118143000+0000||ORU^R01^ORU_R01|msgId0|T|2.6|||NE|AL|||||IHE PCD ORU-R012006^HL7^2.16.840.1.113883.9^HL7"
                  + "\rPID|||SSN3456789^^^&OEP^SSN||Lofasz^Janos||19910120211133.358+0100"
                  + "\rOBR|1|AB1234^Cdog Health Ltd.^6CF049DB5F02^EUI-64|AB1234^Cdog Health Ltd.^6CF049DB5F02^EUI-64|308516007^Well adult monitoring call^SNOMED-CT|||20150118143000+0000|20150118143100+0000"
                  + "\rOBX|2||528425^MDC_DEV_SPEC_PROFILE_HF_CARDIO^MDC|1|||||||X|||20150118143000+0000||||0123456789ABCDEF^EUI-64"
                  + "\rOBX|3|CWE|8454267^MDC_HF_SESSION^MDC|1.0.0.1|8455151^MDC_HF_ACT_UNKNOWN^MDC||||||R|||20150118143000+0000"
                  + "\rOBX|4|NM|68185^MDC_ATTR_TIME_PD_MSMT_ACTIVE^MDC|1.0.0.1.1|5.0|264320^MDC_DIM_SEC^MDC|||||R|||20150118143000+0000"
                  + "\rOBX|5|NM|8454254^MDC_HF_SPEED^MDC|1.0.0.2|10.0|268704^MDC_DIM_M_PER_MIN^MDC|||||R|||20150118143000+0000"
                  + "\rOBX|6|NM|8454246^MDC_HF_ALT^MDC|1.0.0.3|3.2|263424^MDC_DIM_M^MDC|||||R|||20150118143000+0000");
  SpoutOutputCollector collector;
  private Random rand;

  private AtomicInteger i = new AtomicInteger();

  @Override
  public void open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
    this.collector = collector;
    rand = new Random();
  }

  @Override
  public void nextTuple() {
    Integer senderId = rand.nextInt(tuples.size());
    String s = tuples.get(senderId);
    try {
      Thread.sleep(200);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    collector.emit(Arrays.asList(senderId.toString(), s), i.getAndIncrement());

  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {
    declarer.declare(RabbitMqSpout.OUTPUT_FIELDS);

  }

  @Override
  public void ack(Object msgId) {
    System.err.println("Success ack: " + msgId);
  }

  @Override
  public void fail(Object msgId) {
    System.err.println("Fail ack: " + msgId);
  }

}
