package lk.ijse.gdse.automationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelemetryData {
    private String zoneId;
    private TelemetryValue value;

    public static class TelemetryValue {

        private double temperature;

        public TelemetryValue(double temperature) {
            this.temperature = temperature;
        }

        public TelemetryValue() {
        }

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

    }
}