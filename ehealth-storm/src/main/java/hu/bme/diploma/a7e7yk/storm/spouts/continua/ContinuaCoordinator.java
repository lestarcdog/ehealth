package hu.bme.diploma.a7e7yk.storm.spouts.continua;

import java.io.Serializable;

import storm.trident.spout.ITridentSpout.BatchCoordinator;

public class ContinuaCoordinator implements BatchCoordinator<Long>, Serializable {

  private static final long serialVersionUID = 1L;
  private Long counter = 0L;

  @Override
  public Long initializeTransaction(long txid, Long prevMetadata, Long currMetadata) {
    System.out.println(String.format("Coordinator init %d : %d : %d", txid, prevMetadata,
        currMetadata));
    return counter++;
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
