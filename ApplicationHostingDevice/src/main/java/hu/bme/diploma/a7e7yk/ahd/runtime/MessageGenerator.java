package hu.bme.diploma.a7e7yk.ahd.runtime;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.AHDModel;
import hu.bme.diploma.a7e7yk.ahd.datamodel.data.PersonModel;
import hu.bme.diploma.a7e7yk.ahd.datamodel.data.TimeModel;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.PulseOxymeterMeasurement;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.validation.builder.support.NoValidationBuilder;

public class MessageGenerator {

  public static void main(String[] args) {
    HapiContext ctx = new DefaultHapiContext();
    ctx.setValidationRuleBuilder(new NoValidationBuilder());

    AHDModel ahdm = new AHDModel();
    ahdm.setSendingApplicationName("Cdog Health Ltd.");
    ahdm.setSendingApplicationCode("6CF049DB5F02");
    ahdm.setSendingApplicationFormat("EUI-64");
    TimeModel tm = new TimeModel();
    ZonedDateTime mt = ZonedDateTime.of(2015, 1, 18, 15, 30, 0, 0, ZoneId.of("Europe/Budapest"));
    tm.setMeasurementTime(mt);
    ahdm.setTimeModel(tm);

    PersonModel p = new PersonModel();
    p.setFamilyName("Lófasz");
    p.setGivenName("János");
    p.setSsn("SSN3456789");
    p.setBirthDate(LocalDate.of(1990, 12, 20));
    try {
      PulseOxymeterMeasurement pm = new PulseOxymeterMeasurement("1");
      pm.setTimeModel(tm);
      pm.setSpo2(80.9);
      pm.setPulseRate(72.3);

      PCD_01MessageBuilder builder = new PCD_01MessageBuilder("MsgContId_1", ahdm, p);
      Message m = builder.generateMessage(pm);

      Parser parser = ctx.getPipeParser();

      String msg = parser.encode(m);
      System.out.println(msg);
    } catch (HL7Exception e) {
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
