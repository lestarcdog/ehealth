package hu.bme.diploma.a7e7yk.storm.topology;

import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;
import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMqSpout;
import hu.bme.diploma.a7e7yk.storm.trident.bolts.ContinuaMessageConverterTridentBolt;
import hu.bme.diploma.a7e7yk.storm.trident.bolts.PrintLnBolt;
import hu.bme.diploma.a7e7yk.storm.trident.filter.ErrorFilter;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import storm.trident.Stream;
import storm.trident.TridentTopology;
import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.tuple.Fields;

public class EhealthTopology {

  private static final Logger LOG = LoggerFactory.getLogger(EhealthTopology.class);

  public static void main(String[] args) throws InterruptedException, IOException {
    TridentTopology topology = new TridentTopology();

    RabbitMqSpout rabbitMqSpout = new RabbitMqSpout();
    ContinuaMessageConverterTridentBolt continaBolt = new ContinuaMessageConverterTridentBolt();

    Stream inputStream = topology.newStream("stream", rabbitMqSpout);
    Stream realTimeStream =
        inputStream.each(RabbitMqSpout.OUTPUT_FIELDS, continaBolt, ContinuaMessageConverterTridentBolt.OUTPUT_FIELDS)
            .each(ContinuaMessageConverterTridentBolt.OUTPUT_FIELDS, new ErrorFilter())
            .partitionBy(new Fields(StormFieldsConstants.SENDER_ID_FIELD));

    Stream persistStream =
        inputStream.each(RabbitMqSpout.OUTPUT_FIELDS, continaBolt, ContinuaMessageConverterTridentBolt.OUTPUT_FIELDS)
            .each(ContinuaMessageConverterTridentBolt.OUTPUT_FIELDS, new ErrorFilter());

    Stream reportToUserStream =
        inputStream.each(RabbitMqSpout.OUTPUT_FIELDS, continaBolt, ContinuaMessageConverterTridentBolt.OUTPUT_FIELDS);

    // split
    realTimeStream.each(ContinuaMessageConverterTridentBolt.OUTPUT_FIELDS, new PrintLnBolt("realTime"), new Fields(
        "semmi"));
    persistStream.each(ContinuaMessageConverterTridentBolt.OUTPUT_FIELDS, new PrintLnBolt("persistStream"), new Fields(
        "semmi"));
    reportToUserStream.each(ContinuaMessageConverterTridentBolt.OUTPUT_FIELDS, new PrintLnBolt("reportUserStream"),
        new Fields("semmi"));

    Config config = new Config();
    config.put(Config.TOPOLOGY_TRIDENT_BATCH_EMIT_INTERVAL_MILLIS, 200);
    config.put(Config.TOPOLOGY_ENABLE_MESSAGE_TIMEOUTS, false);

    if (args.length == 0) {
      // local cluster

      LocalCluster cluster = new LocalCluster();
      cluster.submitTopology("LOCAL", config, topology.build());
      Thread.sleep(5500);
      cluster.shutdown();
    } else {
      // distributed cluster

    }


  }
}
