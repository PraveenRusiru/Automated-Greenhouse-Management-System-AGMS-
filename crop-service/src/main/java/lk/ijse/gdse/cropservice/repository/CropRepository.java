package lk.ijse.gdse.cropservice.repository;

import lk.ijse.gdse.cropservice.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CropRepository extends JpaRepository<Crop, String> {
    List<Crop> findByUserId(String userId);

}
