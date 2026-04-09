package lk.ijse.gdse.authservice.service;

import lk.ijse.gdse.authservice.dto.UserDTO;
import lk.ijse.gdse.authservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface UserService {
    void register(UserDTO userDTO);

    Map<String, String> login(UserDTO userDTO);

    String refreshAccessToken(String refreshToken);
}
