package lk.ijse.gdse.cropservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Crop {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String cropName;
    private int quantity;
    private String userId;
    @Enumerated(EnumType.STRING)
    private CropStatus status;
    private LocalDateTime plantedDate;

}