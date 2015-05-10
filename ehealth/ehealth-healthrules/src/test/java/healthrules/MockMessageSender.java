package healthrules;

import hu.bme.diploma.a7e7yk.dtos.AbstractRealtimeDto;
import hu.bme.diploma.a7e7yk.interfaces.nettosphere.IRealtimeMessageSender;

public class MockMessageSender implements IRealtimeMessageSender {


  @Override
  public void sendMessageToObservers(AbstractRealtimeDto data) {
    System.out.println(data);

  }

}
