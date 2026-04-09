package lk.ijse.gdse.cropservice.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lk.ijse.gdse.cropservice.entity.CropStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CropDTO {
    private String id;
    private String cropName;
    private int quantity;
    private String userId;
    @Enumerated(EnumType.STRING)
    private CropStatus status;
    private LocalDateTime plantedDate;
}
