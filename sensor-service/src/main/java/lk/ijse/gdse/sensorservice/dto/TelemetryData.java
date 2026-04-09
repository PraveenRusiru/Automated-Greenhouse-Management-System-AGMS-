package lk.ijse.gdse.sensorservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelemetryData {
    private String deviceId;
    private String zoneId;
    private TelemetryValue value;
    private String capturedAt;


    public static class TelemetryValue {
        private double temperature;
        private String tempUnit;
        private double humidity;
        private String humidityUnit;

        public TelemetryValue(double temperature, String tempUnit, double humidity, String humidityUnit) {
            this.temperature = temperature;
            this.tempUnit = tempUnit;
            this.humidity = humidity;
            this.humidityUnit = humidityUnit;
        }

        public TelemetryValue() {
        }

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public String getTempUnit() {
            return tempUnit;
        }

        public void setTempUnit(String tempUnit) {
            this.tempUnit = tempUnit;
        }

        public double getHumidity() {
            return humidity;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }

        public String getHumidityUnit() {
            return humidityUnit;
        }

        public void setHumidityUnit(String humidityUnit) {
            this.humidityUnit = humidityUnit;
        }
    }
}
