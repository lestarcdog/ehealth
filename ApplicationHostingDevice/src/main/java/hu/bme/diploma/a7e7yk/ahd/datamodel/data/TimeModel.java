package hu.bme.diploma.a7e7yk.ahd.datamodel.data;

import java.util.TimeZone;

public class TimeModel {
	private static final TimeZone TIME_ZONE = TimeZone.getTimeZone("UTC");

	String timeSyncProtocol;
	Double timeSyncAccuracy;
	Double timeResolutionAbsolute;
	Double timeResolutionRelative;

	public String getTimeSyncProtocol() {
		return timeSyncProtocol;
	}

	public void setTimeSyncProtocol(String timeSyncProtocol) {
		this.timeSyncProtocol = timeSyncProtocol;
	}

	public Double getTimeSyncAccuracy() {
		return timeSyncAccuracy;
	}

	public void setTimeSyncAccuracy(Double timeSyncAccuracy) {
		this.timeSyncAccuracy = timeSyncAccuracy;
	}
}
