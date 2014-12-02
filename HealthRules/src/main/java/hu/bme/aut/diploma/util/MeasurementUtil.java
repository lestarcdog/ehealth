package hu.bme.aut.diploma.util;

import hu.bme.aut.diploma.model.Measurement;

import java.util.List;

public class MeasurementUtil {
	public static Measurement contains(List<Measurement> list, String type) {
		for (Measurement measurement : list) {
			if(measurement.getType().equals(type)) return measurement;
		}
		return null;
	}
}
