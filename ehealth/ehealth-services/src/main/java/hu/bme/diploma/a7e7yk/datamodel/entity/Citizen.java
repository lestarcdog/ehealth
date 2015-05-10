package hu.bme.diploma.a7e7yk.datamodel.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITIZEN")
public class Citizen {

  @Id
  private String ssn;
  private String name;

  private LocalDate birthDate;

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "Person [ssn=" + ssn + ", name=" + name + ", birthDate=" + birthDate + "]";
  }
}
