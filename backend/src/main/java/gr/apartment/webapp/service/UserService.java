package gr.apartment.webapp.service;

import gr.apartment.webapp.domain.User;
import gr.apartment.webapp.dto.ProfileInfoDTO;
import gr.apartment.webapp.dto.UserDTO;
import gr.apartment.webapp.payload.SignUpRequest;

import java.util.List;

public interface UserService {


    List<UserDTO> findAll();
    User findByUsername(String username);
    User findById(Long id);
    void createAccount(SignUpRequest signUpRequest);
    void editUserPassword(String username, String newPassword);
    void editUserEmail(String username, String newEmail);
    void editUserProfileInfo(String username, ProfileInfoDTO profileInfoDTO);
    void deleteById(Long id);
}
