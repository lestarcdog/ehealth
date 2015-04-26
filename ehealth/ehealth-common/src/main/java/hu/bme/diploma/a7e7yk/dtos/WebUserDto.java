package hu.bme.diploma.a7e7yk.dtos;

public class WebUserDto {
  private String userId;
  private String password;

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

  @Override
  public String toString() {
    return "UserDto [username=" + userId + ", password=" + password + "]";
  }
}
