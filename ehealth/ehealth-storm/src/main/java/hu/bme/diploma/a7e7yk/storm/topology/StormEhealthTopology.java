package hu.bme.diploma.a7e7yk.storm.topology;

import hu.bme.diploma.a7e7yk.storm.bolts.ContinuaMessageConverterBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.ErrorFilterBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.PrintLnBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.RealtimeBolt;
import hu.bme.diploma.a7e7yk.storm.bolts.ReportToSenderBolt;
import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMqSpout;

import java.io.IOException;

import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.topology.TopologyBuilder;

public class StormEhealthTopology {

  public static void main(String[] args) throws InterruptedException, IOException {
    TopologyBuilder builder = new TopologyBuilder();
    RabbitMqSpout rabbitSpout = new RabbitMqSpout();
    builder.setSpout("rabbitSpout", rabbitSpout);
    builder.setBolt("continua", new ContinuaMessageConverterBolt()).shuffleGrouping("rabbitSpout");
    builder.setBolt("errorFilter", new ErrorFilterBolt()).shuffleGrouping("continua");
    builder.setBolt("responseUser", new ReportToSenderBolt()).shuffleGrouping("continua");
    builder.setBolt("realTime", new RealtimeBolt()).shuffleGrouping("errorFilter");
    builder.setBolt("persist", new PrintLnBolt("persist")).shuffleGrouping("errorFilter");

    Config config = new Config();
    LocalCluster cluster = new LocalCluster();
    cluster.submitTopology("eHealthStormTest", config, builder.createTopology());
    Thread.sleep(7000);
    cluster.killTopology("eHealthStormTest");
    cluster.shutdown();


  }
}
