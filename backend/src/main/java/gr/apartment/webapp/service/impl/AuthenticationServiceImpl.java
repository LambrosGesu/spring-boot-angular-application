package gr.apartment.webapp.service.impl;

import gr.apartment.webapp.payload.SignInRequest;
import gr.apartment.webapp.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

//    @Autowired
//    AuthenticationManager authenticationManager;

    @Override
    public ResponseEntity<?> authenticateUser(SignInRequest signInRequest) {

//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword()));
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        String jwt = jwtUtils.generateJwtToken(authentication);
        return null;
    }

//    public AuthenticationResponse authenticateUser(SignInRequest signInRequest) {
//        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signInRequest.getUsername(),
//                signInRequest.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authenticate);
//        String token = jwtProvider.generateToken(authenticate);
//        return AuthenticationResponse.builder()
//                .authenticationToken(token)
//                .refreshToken(refreshTokenService.generateRefreshToken().getToken())
//                .expiresAt(Instant.now().plusMillis(jwtProvider.getJwtExpirationInMillis()))
//                .username(loginRequest.getUsername())
//                .build();
//    }
}
