package hu.bme.diploma.a7e7yk.datamodel.entity;

import hu.bme.diploma.a7e7yk.datamodel.enums.WebUserGroupEnum;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "WEBUSER")
public class WebUser {

  @Id
  @SequenceGenerator(name = "WEBUSER_SEQ", sequenceName = "WEBUSER_SEQ", allocationSize = 1,
      initialValue = 1)
  @GeneratedValue(generator = "WEBUSER_SEQ", strategy = GenerationType.SEQUENCE)
  private Integer id;

  private String userId;

  private String password;

  @Enumerated(EnumType.STRING)
  private WebUserGroupEnum userGroup;

  @OneToOne(optional = true, cascade = CascadeType.ALL)
  private Citizen citizen;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public String toString() {
    return "WebUser [id=" + id + ", userId=" + userId + ", password=" + password + ", userGroup="
        + userGroup + ", person=" + citizen + "]";
  }

  public WebUserGroupEnum getUserGroup() {
    return userGroup;
  }

  public void setUserGroup(WebUserGroupEnum userGroup) {
    this.userGroup = userGroup;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Citizen getCitizen() {
    return citizen;
  }

  public void setCitizen(Citizen citizen) {
    this.citizen = citizen;
  }


}
