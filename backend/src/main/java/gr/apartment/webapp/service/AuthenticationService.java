package gr.apartment.webapp.service;

import gr.apartment.webapp.payload.SignInRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    ResponseEntity<?> authenticateUser(SignInRequest signInRequest);
}
