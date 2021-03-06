package hu.bme.diploma.a7e7yk.datamodel.ahd;


public class AHDModel {
  private String senderId;
  private String sendingApplicationName;
  private String sendingApplicationCode;
  // 28-B2-BD-3A-8C-6B
  private String sendingApplicationFormat;
  private String companyName;
  private String timeSyncProtocol;
  private Double timeSyncAccuracy;
  private Double timeResolutionAbsolute;
  private Double timeResolutionRelative;
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

  public RegistrationCertificateModel getRegistrationCertificateModel() {
    return registrationCertificateModel;
  }

  public void setRegistrationCertificateModel(
      RegistrationCertificateModel registrationCertificateModel) {
    this.registrationCertificateModel = registrationCertificateModel;
  }

  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public String getTimeSyncProtocol() {
    return timeSyncProtocol;
  }

  public void setTimeSyncProtocol(String timeSyncProtocol) {
    this.timeSyncProtocol = timeSyncProtocol;
  }

  public Double getTimeSyncAccuracy() {
    return timeSyncAccuracy;
  }

  public void setTimeSyncAccuracy(Double timeSyncAccuracy) {
    this.timeSyncAccuracy = timeSyncAccuracy;
  }

  public Double getTimeResolutionAbsolute() {
    return timeResolutionAbsolute;
  }

  public void setTimeResolutionAbsolute(Double timeResolutionAbsolute) {
    this.timeResolutionAbsolute = timeResolutionAbsolute;
  }

  public Double getTimeResolutionRelative() {
    return timeResolutionRelative;
  }

  public void setTimeResolutionRelative(Double timeResolutionRelative) {
    this.timeResolutionRelative = timeResolutionRelative;
  }

  @Override
  public String toString() {
    return "AHDModel [senderId=" + senderId + ", sendingApplicationName=" + sendingApplicationName
        + ", sendingApplicationCode=" + sendingApplicationCode + ", sendingApplicationFormat="
        + sendingApplicationFormat + ", companyName=" + companyName + ", timeSyncProtocol="
        + timeSyncProtocol + ", timeSyncAccuracy=" + timeSyncAccuracy + ", timeResolutionAbsolute="
        + timeResolutionAbsolute + ", timeResolutionRelative=" + timeResolutionRelative
        + ", registrationCertificateModel=" + registrationCertificateModel + "]";
  }

}
