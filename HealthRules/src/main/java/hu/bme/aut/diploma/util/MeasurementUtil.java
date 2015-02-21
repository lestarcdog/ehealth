package hu.bme.aut.diploma.util;

import hu.bme.aut.diploma.model.Measurement;
import hu.bme.aut.diploma.model.Person;

import java.util.List;

public class MeasurementUtil {
	public static Measurement contains(List<Measurement> list, String type) {
		for (Measurement measurement : list) {
			if(measurement.getType().equals(type)) return measurement;
		}
		return null;
	}
	
	public static Measurement insertMeasurement(Person patient, String type, double value) {
		Measurement m = new Measurement();
		m.setType(type);
		m.setValue(value);
		patient.getMeasurements().add(m);
		return m;
	}
}
