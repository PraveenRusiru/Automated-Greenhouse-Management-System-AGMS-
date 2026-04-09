package lk.ijse.gdse.automationservice.services;

import lk.ijse.gdse.automationservice.dto.TelemetryData;
import lk.ijse.gdse.automationservice.entity.AutomationLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AutomationService {
    void processTelemetry(TelemetryData data);

    List<AutomationLog> findAllLogs(String userId);
}
