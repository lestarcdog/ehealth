package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.dao.hbase.MeasurementsDao;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;
import hu.bme.diploma.a7e7yk.exceptions.UndefinedMdcTypeException;
import hu.bme.diploma.a7e7yk.storm.StormConstants;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;

public class HbasePersistBolt extends BaseRichBolt {

  private static final Logger logger = LoggerFactory.getLogger(HbasePersistBolt.class);

  private OutputCollector collector;
  private MeasurementsDao measurementsDao;

  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    this.collector = collector;
    try {
      measurementsDao = new MeasurementsDao();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void execute(Tuple input) {
    String userId = input.getStringByField(StormConstants.USER_ID_FIELD);
    List<AbstractVitalSign> vitalSigns =
        (List<AbstractVitalSign>) input.getValueByField(StormConstants.MEASUREMENTS_FIELD);

    for (AbstractVitalSign vitalSign : vitalSigns) {
      try {
        logger.info("Persist to hbase: {}", vitalSign);

        measurementsDao.persistMeasurement(userId, vitalSign);
      } catch (UndefinedMdcTypeException e) {
        logger.error("Programming error", e);
        throw new RuntimeException(e);
      } catch (EhealthException e2) {
        logger.error(null, e2);
      }
      collector.ack(input);
    }

  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {}

}
