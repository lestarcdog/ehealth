package hu.bme.aut.diploma.model;

public class Diagnosis {
	String snomedcode;
	String humanname;

	public String getHumanname() {
		return humanname;
	}

	public void setHumanname(String humanname) {
		this.humanname = humanname;
	}

	public String getSnomedcode() {
		return snomedcode;
	}

	public void setSnomedcode(String snomedcode) {
		this.snomedcode = snomedcode;
	}
}
