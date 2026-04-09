package lk.ijse.gdse.sensorservice.services;

import lk.ijse.gdse.sensorservice.dto.DeviceDTO;
import org.springframework.stereotype.Service;

@Service
public interface ExternalAuthService {
    DeviceDTO registerDeviceAtExternalApi(DeviceDTO deviceDTO);

    String getAccessToken();

    void refreshAccessToken();
}
