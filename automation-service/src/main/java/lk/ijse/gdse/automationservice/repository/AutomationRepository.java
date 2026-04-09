package lk.ijse.gdse.automationservice.repository;

import lk.ijse.gdse.automationservice.entity.AutomationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutomationRepository extends JpaRepository<AutomationLog, Long> {
    List<AutomationLog> findByUserId(String userId);
}
