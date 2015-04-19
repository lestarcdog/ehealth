package hu.bme.diploma.a7e7yk.converter.hl7converter;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v26.message.ORU_R01;
import ca.uhn.hl7v2.parser.Parser;

public class HapiHl7Parser {

  HapiContext ctx;
  Parser parser;

  public HapiHl7Parser() {
    ctx = new DefaultHapiContext();
    parser = ctx.getPipeParser();
  }

  public ORU_R01 parseMessage(String msg) throws HL7Exception {
    ORU_R01 m = new ORU_R01();
    parser.parse(m, msg);
    return m;
  }

  public String unparse(Message message) throws HL7Exception {
    return parser.encode(message);
  }



}
