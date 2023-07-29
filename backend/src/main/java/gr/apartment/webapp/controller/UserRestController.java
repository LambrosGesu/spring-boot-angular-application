package gr.apartment.webapp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import gr.apartment.webapp.dto.UserDTO;
import gr.apartment.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/user")
public class UserRestController {

    @Autowired
    UserService userService;

    @GetMapping("/profile")
    public ResponseEntity<String> getProfileDetails(Principal principal) throws JsonProcessingException {

        if(principal!=null) {
            userService.findByUsername(principal.getName());
            return ResponseEntity.ok().body(null);
//            return ResponseEntity.ok().body(Helpers.convertToJson(UserConverter.convertToDto(user)));
        }
        else
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"Status\": \"Not a user\"}");
    }

    @PutMapping("/profile")
    public ResponseEntity<String> updateProfileDetails(@RequestBody UserDTO userDto, Principal principal) throws JsonProcessingException {
        return null;
    }
}
