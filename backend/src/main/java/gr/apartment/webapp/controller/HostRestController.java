package gr.apartment.webapp.controller;

import gr.apartment.webapp.dto.ApartmentDTO;
import gr.apartment.webapp.service.ApartmentService;
import gr.apartment.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/host")
//@PreAuthorize("hasRole('HOST')")
public class HostRestController {

    @Autowired
    private UserService userService;

    @Autowired
    private ApartmentService apartmentService;

    @GetMapping("/{id}/apartments")
    public ResponseEntity<List<ApartmentDTO>> getHostApartments(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(apartmentService.findByHost(id));
    }

    @PostMapping("/apartment/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createApartment(@RequestBody ApartmentDTO apartmentDTO){
        apartmentService.create(apartmentDTO);
    }

    @PutMapping("/apartment/{id}/edit")
    public void updateApartment(@PathVariable("id") Long id, @RequestBody ApartmentDTO apartmentDTO) {
        apartmentService.update(id, apartmentDTO);
    }

    @DeleteMapping("/apartment/{id}/delete")
    public ResponseEntity<String> deleteApartment(@PathVariable("id") Long id, Principal principal) {
        apartmentService.deleteById(id);
        return ResponseEntity.ok().body("{\"Status\": \"Delete Successful\"}");
    }
}
