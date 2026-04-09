package lk.ijse.gdse.zoneservice.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZoneDTO {
    private String id;
    @Column(unique = true)
    private String name;
    private double minTemp;
    private double maxTemp;
    private String deviceId;
    private String userId;

}
