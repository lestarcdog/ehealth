package hu.bme.diploma.a7e7yk.interfaces.healthrules;

/**
 * Interface for notification from the Decision support engine to the user
 * 
 *
 */
public interface IRealtimeDecision {

  public void notify(RealtimeDecisionMessage msg);

}
