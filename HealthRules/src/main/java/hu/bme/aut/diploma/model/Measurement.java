package hu.bme.aut.diploma.model;

import java.math.BigInteger;
import java.util.Calendar;

public class Measurement {
	Double value;
	String type;
	Calendar date;

	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
}
