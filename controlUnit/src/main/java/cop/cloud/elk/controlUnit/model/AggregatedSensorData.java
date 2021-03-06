package cop.cloud.elk.controlUnit.model;

import static java.util.Arrays.stream;

import java.time.LocalDateTime;

public class AggregatedSensorData {
	public enum AggregationType {
		MIN, MAX, MEAN, STANDARD_DEVIATION;

		public static boolean hasValue(AggregationType aggregationType) {
			return stream(values()).anyMatch(aggregationType::equals);
		}
	}

	private String sensorId;
	private LocalDateTime timestamp;
	private AggregationType aggregationType;
	private double value;

	public AggregatedSensorData() {
		//
	}

	public AggregatedSensorData(String sensorId, AggregationType aggregationType) {
		this.sensorId = sensorId;
		this.aggregationType = aggregationType;
		this.timestamp = LocalDateTime.now();
	}

	public String getSensorId() {
		return sensorId;
	}

	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public AggregationType getAggregationType() {
		return aggregationType;
	}

	public void setAggregationType(AggregationType aggregationType) {
		this.aggregationType = aggregationType;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
