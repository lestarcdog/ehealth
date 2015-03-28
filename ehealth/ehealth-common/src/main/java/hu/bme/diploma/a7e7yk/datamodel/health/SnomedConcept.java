package hu.bme.diploma.a7e7yk.datamodel.health;

public class SnomedConcept {
	private final String snomedId;
	private final String snomedName;

	public SnomedConcept(String snomedId, String snomedName) {
		this.snomedId = snomedId;
		this.snomedName = snomedName;
	}

	public String getSnomedId() {
		return snomedId;
	}

	public String getSnomedName() {
		return snomedName;
	}
}
