package gr.apartment.webapp.payload;

import lombok.Getter;

@Getter
public class SignInRequest {
    private String username;
    private String password;

}
