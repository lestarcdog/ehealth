package hu.bme.diploma.a7e7yk.storm.spouts.continua;

import java.io.Serializable;
import java.util.Arrays;

import storm.trident.operation.TridentCollector;
import storm.trident.spout.ITridentSpout.Emitter;
import storm.trident.topology.TransactionAttempt;

public class ContinuaEmitter implements Emitter<Long>, Serializable {

  @Override
  public void emitBatch(TransactionAttempt tx, Long coordinatorMeta, TridentCollector collector) {
    System.out.println("Emit emitter " + tx);
    System.out.println("Emit  emitter coordinatorMeta: " + coordinatorMeta);

    // List<Object> list =
    // IntStream.generate(() -> (int) (Math.random() * 100)).limit(5).boxed()
    // .collect(Collectors.toList());
    for (int i = 0; i < 6; i++) {
      collector.emit(Arrays.asList(new Integer(i)));
    }
  }

  @Override
  public void success(TransactionAttempt tx) {
    // RabbitMQ ack
    // Rabbit
    System.out.println("Succes emitter " + tx);
  }

  @Override
  public void close() {}

}
