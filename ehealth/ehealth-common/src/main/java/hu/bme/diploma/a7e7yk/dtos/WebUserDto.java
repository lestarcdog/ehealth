package hu.bme.diploma.a7e7yk.dtos;

public class WebUserDto {
  private Integer id;
  private String userId;
  private String password;

  private String name;
  private String ssn;
  private String userGroup;


  public WebUserDto() {}

  public WebUserDto(String username, String password) {
    this.userId = username;
    this.password = password;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String username) {
    this.userId = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public String getUserGroup() {
    return userGroup;
  }

  public void setUserGroup(String userGroup) {
    this.userGroup = userGroup;
  }

  @Override
  public String toString() {
    return "WebUserDto [userId=" + userId + ", password=" + password + ", name=" + name + ", ssn="
        + ssn + "]";
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


}
