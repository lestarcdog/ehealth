package hl7conversion;

import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSignValue;
import hu.bme.diploma.a7e7yk.hl7conversion.Hl7MessageConverter;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;
import ca.uhn.hl7v2.parser.Parser;

public class HL7MessageConverterTest {

  private HapiContext ctx = new DefaultHapiContext();


  @Test
  public void testConversionBloodPressure() throws HL7Exception {
    String msg =
        "MSH|^~\\&|Cdog Health Ltd.^6CF049DB5F02^EUI-64||||20150118143000+0000||ORU^R01^ORU_R01|msgId0|T|2.6|||NE|AL|||||IHE PCD ORU-R012006^HL7^2.16.840.1.113883.9^HL7"
            + "\nPID|||SSN3456789^^^&OEP^SSN||Lófasz^János||19910120082615.471+0100"
            + "\nOBR|1|AB1234^Cdog Health Ltd.^6CF049DB5F02^EUI-64|AB1234^Cdog Health Ltd.^6CF049DB5F02^EUI-64|135840009^Blood pressure monitoring^SNOMED-CT|||20150118143000+0000|20150118143100+0000"
            + "\nOBX|2||528391^MDC_DEV_SPEC_PROFILE_BP^MDC|1|||||||X|||20150118143000+0000||||0123456789ABCDEF^EUI-64"
            + "\nOBX|3||150020^MDC_PRESS_BLD_NONINV^MDC|1.0.1|||||||X|||20150118143000+0000"
            + "\nOBX|4|NM|150021^MDC_PRESS_BLD_NONINV_SYS^MDC|1.0.1.1|140.5|266016^MDC_DIM_MMHG^MDC|||||R|||20150118143000+0000"
            + "\nOBX|5|NM|150022^MDC_PRESS_BLD_NONINV_DIA^MDC|1.0.1.2|95.0|266016^MDC_DIM_MMHG^MDC|||||R|||20150118143000+0000"
            + "\nOBX|6|NM|149546^MDC_PULS_RATE_NON_INV^MDC|1.0.0.1|75.5|264864^MDC_DIM_BEAT_PER_MIN^MDC|||||R|||20150118143000+0000";
    ORU_R01 m = parseMessage(msg);
    List<AbstractVitalSignValue> vs = Hl7MessageConverter.getVitalSignValues(m);
    Assert.assertEquals(1, vs.size());

  }

  private ORU_R01 parseMessage(String msg) throws HL7Exception {
    Parser p = ctx.getPipeParser();
    ORU_R01 m = new ORU_R01();
    p.parse(m, msg);
    return m;
  }
}
