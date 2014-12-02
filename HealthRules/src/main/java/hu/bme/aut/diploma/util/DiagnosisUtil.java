package hu.bme.aut.diploma.util;

import hu.bme.aut.diploma.model.Diagnosis;

import java.util.List;

public class DiagnosisUtil {
	public static boolean contains(List<Diagnosis> list, String code) {
		for (Diagnosis diagnosis : list) {
			if(diagnosis.getSnomedcode().equals(code)) return true;
		}
		return false;
	}
}
