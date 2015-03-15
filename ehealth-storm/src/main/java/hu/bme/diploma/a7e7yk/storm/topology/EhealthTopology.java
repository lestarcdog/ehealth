package hu.bme.diploma.a7e7yk.storm.topology;

import hu.bme.diploma.a7e7yk.storm.bolts.PrintLnBolt;
import hu.bme.diploma.a7e7yk.storm.spouts.basic.ContinuaSpout;
import storm.trident.Stream;
import storm.trident.TridentTopology;
import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.tuple.Fields;

public class EhealthTopology {

  public static void main(String[] args) throws InterruptedException {
    TridentTopology topology = new TridentTopology();
    ContinuaSpout cspout = new ContinuaSpout();
    Stream inputStream = topology.newStream("stream", cspout);
    inputStream.each(new Fields("test"), new PrintLnBolt(), new Fields("semmi"));
    inputStream.shuffle();

    Config config = new Config();

    if (args.length == 0) {
      // local cluster
      LocalCluster cluster = new LocalCluster();
      cluster.submitTopology("LOCAL", config, topology.build());
      Thread.sleep(3500);
      cluster.shutdown();
    } else {
      // distributed cluster

    }


  }

}
