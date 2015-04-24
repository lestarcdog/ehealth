package topology;

import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;
import hu.bme.diploma.a7e7yk.storm.bolts.ContinuaMessageConverterBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.ErrorFilterBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.HbasePersistBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.RealtimeBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.ReportToSenderBolt;
import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMqSpout;

import java.io.IOException;

import org.junit.Test;

import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.topology.TopologyBuilder;
import backtype.storm.tuple.Fields;

public class StormTopologyTest {

  @Test
  public void stormTopology() throws InterruptedException, IOException {
    TopologyBuilder builder = new TopologyBuilder();
    // RabbitMqMockSpout rabbitSpout = new RabbitMqMockSpout();
    RabbitMqSpout rabbitSpout = new RabbitMqSpout();

    builder.setSpout("rabbitSpout", rabbitSpout);
    builder.setBolt("continua", new ContinuaMessageConverterBolt()).shuffleGrouping("rabbitSpout");
    builder.setBolt("errorFilter", new ErrorFilterBolt()).shuffleGrouping("continua");
    // builder.setBolt("responseUser", new ReportToSenderMockBolt()).shuffleGrouping("continua");
    builder.setBolt("responseUser", new ReportToSenderBolt()).shuffleGrouping("continua");

    builder.setBolt("realTime", new RealtimeBolt()).fieldsGrouping("errorFilter",
        new Fields(StormFieldsConstants.USER_ID_FIELD));
    builder.setBolt("persist", new HbasePersistBolt()).shuffleGrouping("errorFilter");

    long start = System.currentTimeMillis();

    Config config = new Config();
    LocalCluster cluster = new LocalCluster();
    cluster.submitTopology("eHealthStormTest", config, builder.createTopology());
    Thread.sleep(50000);
    cluster.killTopology("eHealthStormTest");
    cluster.shutdown();

    System.err.println("Time: " + Long.valueOf(System.currentTimeMillis() - start));
  }
}
