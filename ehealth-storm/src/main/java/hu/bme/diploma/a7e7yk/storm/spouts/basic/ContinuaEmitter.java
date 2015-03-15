package hu.bme.diploma.a7e7yk.storm.spouts.basic;

import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMQConsumer;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import storm.trident.operation.TridentCollector;
import storm.trident.spout.ITridentSpout.Emitter;
import storm.trident.topology.TransactionAttempt;

public class ContinuaEmitter implements Emitter<List<Long>>, Serializable {

  private static final Logger LOG = LoggerFactory.getLogger(ContinuaEmitter.class);
  private RabbitMQConsumer consumer;
  private List<Long> coordinatorMeta;
  private long counter = 0;

  public ContinuaEmitter() {
    // try {
    // consumer = new RabbitMQConsumer("localhost", 9999);
    // } catch (IOException e) {
    // LOG.error("Can't start rabbitmq consumer", e);
    // }
  }

  @Override
  public void emitBatch(TransactionAttempt tx, List<Long> coordinatorMeta,
      TridentCollector collector) {
    this.coordinatorMeta = coordinatorMeta;
    LOG.info("Emit emitter " + tx);
    LOG.info("Emit  emitter coordinatorMeta: " + coordinatorMeta);

    // List<Object> list =
    // IntStream.generate(() -> (int) (Math.random() * 100)).limit(5).boxed()
    // .collect(Collectors.toList());
    for (int i = 0; i < 6; i++) {
      coordinatorMeta.add(counter++);
      collector.emit(Arrays.asList(new String("" + i + "_" + tx.getTransactionId() + "_"
          + tx.getAttemptId())));
    }
  }

  @Override
  public void success(TransactionAttempt tx) {
    // RabbitMQ ack
    coordinatorMeta.stream().forEach(System.out::println);
    // Rabbit
    LOG.info("Succes emitter " + tx);
  }

  @Override
  public void close() {}

}
