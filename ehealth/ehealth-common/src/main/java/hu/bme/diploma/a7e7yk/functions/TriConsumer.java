package hu.bme.diploma.a7e7yk.functions;

import hu.bme.diploma.a7e7yk.exceptions.EhealthException;

public interface TriConsumer<T, U, R> {

  public void accept(T t, U u, R r) throws EhealthException;
}
