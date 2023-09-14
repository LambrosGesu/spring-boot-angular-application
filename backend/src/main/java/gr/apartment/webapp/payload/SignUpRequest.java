package gr.apartment.webapp.payload;

import gr.apartment.webapp.enums.UserRole;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class SignUpRequest {

    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private UserRole role;
//    private String telephone;
//    private String approved;

}
