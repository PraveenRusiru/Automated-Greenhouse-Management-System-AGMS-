package lk.ijse.gdse.sensorservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeviceDTO {
    private String deviceId;
    private String name;
    private String zoneId;
    private String userId;

}
