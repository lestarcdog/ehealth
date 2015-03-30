package topology;

import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMqSpout;
import hu.bme.diploma.a7e7yk.storm.topology.EhealthTopology;
import hu.bme.diploma.a7e7yk.storm.trident.bolts.ContinuaMessageConverterTridentBolt;
import hu.bme.diploma.a7e7yk.storm.trident.bolts.PrintLnBolt;
import hu.bme.diploma.a7e7yk.storm.trident.filter.ErrorFilter;

import java.io.IOException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rabbitmq.RabbitMqMockSpout;
import storm.trident.Stream;
import storm.trident.TridentTopology;
import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.tuple.Fields;

public class TridentTopologyTest {

  private static final Logger LOG = LoggerFactory.getLogger(EhealthTopology.class);

  @Test
  public void tridentTopology() throws InterruptedException, IOException {
    TridentTopology topology = new TridentTopology();

    RabbitMqMockSpout rabbitMqSpout = new RabbitMqMockSpout();
    // ContinuaMessageConverterBolt continaBolt = new ContinuaMessageConverterBolt();

    Stream inputStream =
        topology.newStream("stream", rabbitMqSpout).each(RabbitMqSpout.OUTPUT_FIELDS,
            new ContinuaMessageConverterTridentBolt(), ContinuaMessageConverterTridentBolt.OUTPUT_FIELDS);
    Stream errorFreeStream = inputStream.each(ContinuaMessageConverterTridentBolt.OUTPUT_FIELDS, new ErrorFilter());

    Stream realTimeStream = errorFreeStream.partitionBy(new Fields(RabbitMqSpout.SENDER_ID_FIELD));
    Stream persistStream = errorFreeStream;
    Fields reportInputFields =
        new Fields(RabbitMqSpout.SENDER_ID_FIELD, ContinuaMessageConverterTridentBolt.USER_ID_FIELD,
            ContinuaMessageConverterTridentBolt.ERROR_FIELD);
    Stream reportToUserStream = inputStream;


    // split
    realTimeStream.each(ContinuaMessageConverterTridentBolt.OUTPUT_FIELDS, new PrintLnBolt("realTimeStream"), new Fields(
        "semmi"));
    persistStream.each(ContinuaMessageConverterTridentBolt.OUTPUT_FIELDS, new PrintLnBolt("persistStream"),
        new Fields("semmi"));
    reportToUserStream.each(reportInputFields, new PrintLnBolt("reportToUserStream"), new Fields("semmi"));

    Config config = new Config();
    config.put(Config.TOPOLOGY_ENABLE_MESSAGE_TIMEOUTS, false);

    LocalCluster cluster = new LocalCluster();
    cluster.submitTopology("LOCAL", config, topology.build());
    Thread.sleep(4000);
    cluster.shutdown();
  }
}
