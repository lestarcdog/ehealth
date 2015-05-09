package hu.bme.diploma.a7e7yk.dtos;

import java.time.LocalDate;

public class CitizenDto {
  private String ssn;
  private String name;
  private LocalDate birthDate;

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

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

}
