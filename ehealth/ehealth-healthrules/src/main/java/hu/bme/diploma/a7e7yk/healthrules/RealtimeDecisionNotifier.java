package hu.bme.diploma.a7e7yk.healthrules;

import hu.bme.diploma.a7e7yk.converters.RealTimeDtoConverter;
import hu.bme.diploma.a7e7yk.interfaces.healthrules.IRealtimeNotifyDecision;
import hu.bme.diploma.a7e7yk.interfaces.healthrules.RealtimeDecisionMessage;
import hu.bme.diploma.a7e7yk.interfaces.nettosphere.IRealtimeMessageSender;

public class RealtimeDecisionNotifier implements IRealtimeNotifyDecision {

  IRealtimeMessageSender senderService;

  public RealtimeDecisionNotifier(IRealtimeMessageSender senderService) {
    this.senderService = senderService;
  }

  @Override
  public void notify(RealtimeDecisionMessage msg) {
    senderService.sendMessageToObservers(RealTimeDtoConverter.convert2Decision(msg));
  }
}
