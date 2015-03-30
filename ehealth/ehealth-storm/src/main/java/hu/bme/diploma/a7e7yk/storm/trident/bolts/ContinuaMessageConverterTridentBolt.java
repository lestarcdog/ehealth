package hu.bme.diploma.a7e7yk.storm.trident.bolts;

import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSignValue;
import hu.bme.diploma.a7e7yk.hl7conversion.Hl7MessageConverter;
import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import storm.trident.operation.BaseFunction;
import storm.trident.operation.TridentCollector;
import storm.trident.operation.TridentOperationContext;
import storm.trident.tuple.TridentTuple;
import backtype.storm.tuple.Fields;
import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;
import ca.uhn.hl7v2.parser.Parser;

public class ContinuaMessageConverterTridentBolt extends BaseFunction {

  private static final long serialVersionUID = 2269618342384875116L;
  private static final Logger LOG = LoggerFactory.getLogger(ContinuaMessageConverterTridentBolt.class);
  public static final Fields OUTPUT_FIELDS = new Fields(StormFieldsConstants.USER_ID_FIELD,
      StormFieldsConstants.MEASUREMENTS_FIELD, StormFieldsConstants.ERROR_FIELD);

  private Parser parser;
  private HapiContext ctx;
  private int i = 0;

  @Override
  public void execute(TridentTuple tuple, TridentCollector collector) {
    String msgTxt = (String) tuple.getStringByField(StormFieldsConstants.CONTINUA_MSG_FIELD);
    ORU_R01 message = new ORU_R01();
    try {
      parser.parse(message, msgTxt);
      LOG.info(msgTxt);
      PersonModel personModel = Hl7MessageConverter.getPersonModel(message);
      List<AbstractVitalSignValue> vitalValues = Hl7MessageConverter.getVitalSignValues(message);
      // emit userId = ssn and list of vitalsigns
      collector.emit(Arrays.asList(personModel.getSsn(), vitalValues, null));
    } catch (HL7Exception e) {
      LOG.info(null, e);
      collector.emit(Arrays.asList());
      return;
    }

  }

  @Override
  public void cleanup() {
    try {
      ctx.close();
    } catch (Throwable e) {
      LOG.error("Failed to close hapi context", e);
    }
    super.cleanup();
  }

  @Override
  public void prepare(Map conf, TridentOperationContext context) {
    ctx = new DefaultHapiContext();
    parser = ctx.getPipeParser();
  }



}
