package lk.ijse.gdse.automationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ZoneDTO {
    private String id;
    private double minTemp;
    private double maxTemp;
    private String userId;
}