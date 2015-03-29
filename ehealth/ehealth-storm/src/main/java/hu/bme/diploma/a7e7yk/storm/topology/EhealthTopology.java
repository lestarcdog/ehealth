package hu.bme.diploma.a7e7yk.storm.topology;

import hu.bme.diploma.a7e7yk.storm.bolts.ContinuaMessageConverterBolt;
import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMqSpout;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import storm.trident.Stream;
import storm.trident.TridentTopology;
import backtype.storm.Config;
import backtype.storm.LocalCluster;

public class EhealthTopology {

  private static final Logger LOG = LoggerFactory.getLogger(EhealthTopology.class);

  public static void main(String[] args) throws InterruptedException, IOException {
    TridentTopology topology = new TridentTopology();

    RabbitMqSpout rabbitMqSpout = new RabbitMqSpout();
    ContinuaMessageConverterBolt continaBolt = new ContinuaMessageConverterBolt();
    try {
      rabbitMqSpout = new RabbitMqSpout();

      Stream inputStream = topology.newStream("stream", rabbitMqSpout);
      Stream realTimeStream =
          inputStream.each(RabbitMqSpout.OUTPUT_FIELDS, continaBolt,
              ContinuaMessageConverterBolt.OUTPUT_FIELDS_OK);
      Stream persistStream =
          inputStream.each(RabbitMqSpout.OUTPUT_FIELDS, continaBolt,
              ContinuaMessageConverterBolt.OUTPUT_FIELDS_OK);
      Stream reportToUserStrem =
          inputStream.each(RabbitMqSpout.OUTPUT_FIELDS, continaBolt,
              ContinuaMessageConverterBolt.OUTPUT_FIELDS_ERROR);
      inputStream.shuffle();



    } catch (IOException e) {
      LOG.error(null, e);
    }

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
