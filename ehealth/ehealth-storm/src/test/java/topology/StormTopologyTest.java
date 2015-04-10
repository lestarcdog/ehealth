package topology;

import hu.bme.diploma.a7e7yk.storm.bolts.ContinuaMessageConverterBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.ErrorFilterBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.PrintLnBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.RealtimeBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.ReportToSenderBolt;

import org.junit.Test;

import rabbitmq.RabbitMqMockSpout;
import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.topology.TopologyBuilder;

public class StormTopologyTest {

  @Test
  public void stormTopology() throws InterruptedException {
    TopologyBuilder builder = new TopologyBuilder();
    builder.setSpout("rabbitSpout", new RabbitMqMockSpout());
    builder.setBolt("continua", new ContinuaMessageConverterBolt()).shuffleGrouping("rabbitSpout");
    builder.setBolt("errorFilter", new ErrorFilterBolt()).shuffleGrouping("continua");
    builder.setBolt("responseUser", new ReportToSenderBolt()).shuffleGrouping("continua");
    builder.setBolt("realTime", new RealtimeBolt()).shuffleGrouping("errorFilter");
    builder.setBolt("persist", new PrintLnBolt("persist")).shuffleGrouping("errorFilter");

    Config config = new Config();
    LocalCluster cluster = new LocalCluster();
    cluster.submitTopology("eHealthStormTest", config, builder.createTopology());
    Thread.sleep(4500);
    cluster.killTopology("eHealthStormTest");
    cluster.shutdown();

  }
}
