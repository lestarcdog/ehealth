package topology;

import hu.bme.diploma.a7e7yk.storm.bolts.ContinuaMessageConverterBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.PrintLnBolt;
import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMqSpout;
import hu.bme.diploma.a7e7yk.storm.topology.EhealthTopology;

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

public class StormTopologyTest {

  private static final Logger LOG = LoggerFactory.getLogger(EhealthTopology.class);

  @Test
  public void test1() throws InterruptedException, IOException {
    TridentTopology topology = new TridentTopology();

    RabbitMqMockSpout rabbitMqSpout = new RabbitMqMockSpout();
    ContinuaMessageConverterBolt continaBolt = new ContinuaMessageConverterBolt();

    Stream inputStream = topology.newStream("stream", rabbitMqSpout);
    Stream realTimeStream =
        inputStream.each(RabbitMqSpout.OUTPUT_FIELDS, continaBolt,
            ContinuaMessageConverterBolt.OUTPUT_FIELDS).shuffle();
    Stream persistStream =
        inputStream.each(RabbitMqSpout.OUTPUT_FIELDS, continaBolt,
            ContinuaMessageConverterBolt.OUTPUT_FIELDS);
    Stream reportToUserStream =
        inputStream.each(RabbitMqSpout.OUTPUT_FIELDS, continaBolt,
            ContinuaMessageConverterBolt.OUTPUT_FIELDS);
    // split
    realTimeStream.each(ContinuaMessageConverterBolt.OUTPUT_FIELDS, new PrintLnBolt("realTime"),
        new Fields("semmi")).parallelismHint(2);
    persistStream.each(ContinuaMessageConverterBolt.OUTPUT_FIELDS,
        new PrintLnBolt("persistStream"), new Fields("semmi"));
    reportToUserStream.each(ContinuaMessageConverterBolt.OUTPUT_FIELDS, new PrintLnBolt(
        "reportUserStream"), new Fields("semmi"));

    Config config = new Config();
    config.put(Config.TOPOLOGY_TRIDENT_BATCH_EMIT_INTERVAL_MILLIS, 200);
    config.put(Config.TOPOLOGY_ENABLE_MESSAGE_TIMEOUTS, false);

    LocalCluster cluster = new LocalCluster();
    cluster.submitTopology("LOCAL", config, topology.build());
    Thread.sleep(3500);
    cluster.shutdown();
  }
}
