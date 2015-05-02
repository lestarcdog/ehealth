package hu.bme.diploma.a7e7yk.storm.topology;

import hu.bme.diploma.a7e7yk.storm.StormConstants;
import hu.bme.diploma.a7e7yk.storm.bolts.ContinuaMessageConverterBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.ErrorFilterBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.HbasePersistBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.RealtimeBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.ReportErrorToSenderBolt;
import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMqSpout;

import java.io.IOException;

import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.topology.TopologyBuilder;
import backtype.storm.tuple.Fields;

public class EhealthStormTopology {

  public static void main(String[] args) throws InterruptedException, IOException {
    TopologyBuilder builder = new TopologyBuilder();
    RabbitMqSpout rabbitSpout = new RabbitMqSpout();

    builder.setSpout("rabbitSpout", rabbitSpout);
    builder.setBolt("continua", new ContinuaMessageConverterBolt()).shuffleGrouping("rabbitSpout");
    builder.setBolt("errorFilter", new ErrorFilterBolt()).shuffleGrouping("continua");
    builder.setBolt("responseErrorUser", new ReportErrorToSenderBolt()).shuffleGrouping("continua");

    builder.setBolt("realTime", new RealtimeBolt()).fieldsGrouping("errorFilter",
        new Fields(StormConstants.USER_ID_FIELD));
    builder.setBolt("persist", new HbasePersistBolt()).shuffleGrouping("errorFilter");

    Config config = new Config();
    LocalCluster cluster = new LocalCluster();
    cluster.submitTopology("eHealthStormTest", config, builder.createTopology());
    Thread.sleep(30000);
    cluster.killTopology("eHealthStormTest");
    cluster.shutdown();

  }
}
