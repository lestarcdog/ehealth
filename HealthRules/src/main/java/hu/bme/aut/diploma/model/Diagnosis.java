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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((snomedcode == null) ? 0 : snomedcode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diagnosis other = (Diagnosis) obj;
		if (snomedcode == null) {
			if (other.snomedcode != null)
				return false;
		} else if (!snomedcode.equals(other.snomedcode))
			return false;
		return true;
	}
}
