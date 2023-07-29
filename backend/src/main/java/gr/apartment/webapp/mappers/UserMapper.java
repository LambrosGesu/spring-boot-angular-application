package gr.apartment.webapp.mappers;

import gr.apartment.webapp.domain.User;
import gr.apartment.webapp.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private final ModelMapper modelMapper;

    public UserMapper() {
        modelMapper = new ModelMapper();
    }

    public UserDTO mapUserToUserDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }
    public User mapUserDtoToUser(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }
}
