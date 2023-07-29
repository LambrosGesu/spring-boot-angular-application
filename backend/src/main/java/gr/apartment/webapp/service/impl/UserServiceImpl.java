package gr.apartment.webapp.service.impl;

import gr.apartment.webapp.domain.User;
import gr.apartment.webapp.dto.ProfileInfoDTO;
import gr.apartment.webapp.dto.UserDTO;
import gr.apartment.webapp.enums.Gender;
import gr.apartment.webapp.enums.UserRole;
import gr.apartment.webapp.mappers.UserMapper;
import gr.apartment.webapp.payload.SignUpRequest;
import gr.apartment.webapp.repository.UserRepository;
import gr.apartment.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

//    @Autowired
//    AddressRepository addressRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream()
                .map(user -> userMapper.mapUserToUserDTO(user))
                .collect(Collectors.toList());
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findUserByUsername(username).get();
    }

    @Override
    public void createAccount(SignUpRequest signUpRequest) {
        User user = buildUserFromSignUpRequest(signUpRequest);
        userRepository.save(user);
    }

    private User buildUserFromSignUpRequest(SignUpRequest signUpRequest) {
        User user = new User();
        user.setUsername(signUpRequest.getUsername());
        user.setPassword(signUpRequest.getPassword());
        user.setEmail(signUpRequest.getEmail());
        user.setRole(UserRole.USER);
        user.setCreatedOn(LocalDateTime.now());
        return user;
    }

    @Override
    public void editUserPassword(String username, String newPassword) {
        Optional<User> user = userRepository.findUserByUsername(username);
        user.ifPresent(value -> value.setPassword(newPassword));
    }

    @Override
    public void editUserEmail(String username, String newEmail) {
        Optional<User> user = userRepository.findUserByUsername(username);
        user.ifPresent(user1 -> user1.setEmail(newEmail));
    }

    @Override
    public void editUserProfileInfo(String username, ProfileInfoDTO profileInfoDTO) {
        Optional<User> user = userRepository.findUserByUsername(username);
        if(Objects.nonNull(profileInfoDTO) && user.isPresent()){
            user.get().setFirstname(profileInfoDTO.getFirstname());
            user.get().setLastname(profileInfoDTO.getLastname());
            user.get().setGender(Gender.valueOf(profileInfoDTO.getGender()));
            userRepository.save(user.get());
        }
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
