package hu.bme.diploma.a7e7yk.ahd.datamodel;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.AHDModel;
import hu.bme.diploma.a7e7yk.ahd.datamodel.data.PersonModel;
import hu.bme.diploma.a7e7yk.ahd.datamodel.data.TimeModel;
import hu.bme.diploma.a7e7yk.ahd.runtime.IMessageBuilder;

import java.util.List;

import ca.uhn.hl7v2.model.v26.segment.OBR;
import ca.uhn.hl7v2.model.v26.segment.OBX;
import ca.uhn.hl7v2.model.v26.segment.PID;

public class MetadataSegments {

	private PersonModel personModel;
	private TimeModel timeModel;
	private AHDModel ahdModel;

	public PID getPID(IMessageBuilder builder) {
		return null;
	}

	public OBR getOBR(IMessageBuilder builder) {
		return null;
	}

	public List<OBX> getAHDOBXs(IMessageBuilder builder) {
		return null;
	}

}
