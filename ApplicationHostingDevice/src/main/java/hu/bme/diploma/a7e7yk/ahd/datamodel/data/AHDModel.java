package hu.bme.diploma.a7e7yk.ahd.datamodel.data;

public class AHDModel {

	private String sendingApplicationName;
	private String sendingApplicationCode;
	// 28-B2-BD-3A-8C-6B
	private String sendingApplicationFormat;
	private String companyName;
	private TimeModel timeModel;
	private RegistrationCertificateModel registrationCertificateModel;

	public String getSendingApplicationName() {
		return sendingApplicationName;
	}

	public void setSendingApplicationName(String sendingApplicationName) {
		this.sendingApplicationName = sendingApplicationName;
	}

	public String getSendingApplicationCode() {
		return sendingApplicationCode;
	}

	public void setSendingApplicationCode(String sendingApplicationCode) {
		this.sendingApplicationCode = sendingApplicationCode;
	}

	public String getSendingApplicationFormat() {
		return sendingApplicationFormat;
	}

	public void setSendingApplicationFormat(String sendingApplicationFormat) {
		this.sendingApplicationFormat = sendingApplicationFormat;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public TimeModel getTimeModel() {
		return timeModel;
	}

	public void setTimeModel(TimeModel timeModel) {
		this.timeModel = timeModel;
	}

	public RegistrationCertificateModel getRegistrationCertificateModel() {
		return registrationCertificateModel;
	}

	public void setRegistrationCertificateModel(
			RegistrationCertificateModel registrationCertificateModel) {
		this.registrationCertificateModel = registrationCertificateModel;
	}

}
