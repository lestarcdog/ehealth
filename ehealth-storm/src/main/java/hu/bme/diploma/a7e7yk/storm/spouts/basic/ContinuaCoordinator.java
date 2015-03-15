package hu.bme.diploma.a7e7yk.storm.spouts.basic;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import storm.trident.spout.ITridentSpout.BatchCoordinator;

public class ContinuaCoordinator implements BatchCoordinator<List<Long>>, Serializable {

  private static final long serialVersionUID = 1L;
  private Long counter = 0L;

  @Override
  public List<Long> initializeTransaction(long txid, List<Long> prevMetadata,
      List<Long> currMetadata) {
    return new LinkedList<Long>();
  }

  @Override
  public void success(long txid) {
    System.out.println("Coordinator success: " + txid);
  }

  @Override
  public boolean isReady(long txid) {
    return true;
  }

  @Override
  public void close() {}

}
