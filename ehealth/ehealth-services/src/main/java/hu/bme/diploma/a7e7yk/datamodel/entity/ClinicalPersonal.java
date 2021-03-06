package hu.bme.diploma.a7e7yk.datamodel.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLINICAL_PERSONAL")
public class ClinicalPersonal {

  @Id
  @JoinColumn(name = "CLINICAL_PERSONAL_ID")
  private WebUser id;

  @ManyToMany
  @JoinTable(name = "CLINICALP_CITIZEN", joinColumns = {@JoinColumn(name = "CLINICAL_PERSONAL_ID")},
      inverseJoinColumns = {@JoinColumn(name = "CITIZEN_SSN")})
  private List<Citizen> patients = new LinkedList<Citizen>();

  public WebUser getId() {
    return id;
  }

  public void setId(WebUser id) {
    this.id = id;
  }

  public List<Citizen> getPatients() {
    return patients;
  }

  public void setPatients(List<Citizen> patients) {
    this.patients = patients;
  }

  @Override
  public String toString() {
    return "ClinicalPersonalEntity [id=" + id + ", patients=" + patients + "]";
  }
}
