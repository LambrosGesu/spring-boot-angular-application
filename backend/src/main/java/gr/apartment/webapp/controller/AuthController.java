package gr.apartment.webapp.controller;

import gr.apartment.webapp.payload.SignInRequest;
import gr.apartment.webapp.payload.SignUpRequest;
import gr.apartment.webapp.service.AuthenticationService;
import gr.apartment.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    UserService userService;

    @PostMapping(value = "/signIn", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody SignInRequest signInRequest) {
        return authenticationService.authenticateUser(signInRequest);
    }

    @PostMapping("/signUp")
    public String registerUser(@RequestBody SignUpRequest signUpRequest) {
        userService.createAccount(signUpRequest);
        return "success";
    }

}
