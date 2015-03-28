package hu.bme.diploma.a7e7yk.datamodel.ahd;

public class RegistrationCertificateModel {
	private final String dataAuthorizationBody = "auth-body-empty";
	private final String dataAuthorizationBodyId = "0";

	public String getDataAuthorizationBodyId() {
		return dataAuthorizationBodyId;
	}

	private final String continuaVersion = "1.5";

	public String getDataAuthorizationBody() {
		return dataAuthorizationBody;
	}

	public String getContinuaVersion() {
		return continuaVersion;
	}

}
