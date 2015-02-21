package hu.bme.aut.diploma.util;

import hu.bme.aut.diploma.model.Diagnosis;
import hu.bme.aut.diploma.model.Person;

import java.util.List;

public class DiagnosisUtil {
	public static boolean contains(List<Diagnosis> list, String code) {
		for (Diagnosis diagnosis : list) {
			if(diagnosis.getSnomedcode().equals(code)) return true;
		}
		return false;
	}
	
	public static Diagnosis insertDiagnosis(Person patient, String snomedic, String humanname) { 
		Diagnosis d = new Diagnosis();
		d.setHumanname(humanname);
		d.setSnomedcode(snomedic);
		patient.getDiagnosis().add(d);
		if(!patient.getDiagnosis().contains(d)) {
			patient.getDiagnosis().add(d);
		}
		return d;
	}
}
