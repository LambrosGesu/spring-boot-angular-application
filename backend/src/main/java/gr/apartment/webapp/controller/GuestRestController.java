package gr.apartment.webapp.controller;

import gr.apartment.webapp.dto.ApartmentDTO;
import gr.apartment.webapp.dto.SearchApartmentCriteriaDTO;
import gr.apartment.webapp.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/apartment")
public class GuestRestController {

    @Autowired
    private ApartmentService apartmentService;

    @GetMapping("/all")
    public ResponseEntity<List<ApartmentDTO>> getAllApartments() {
        return ResponseEntity.ok().body(apartmentService.findAll());
    }

    @GetMapping("/apartments/filtered")
    public ResponseEntity<List<ApartmentDTO>> getFilteredApartments(@RequestBody SearchApartmentCriteriaDTO searchApartmentCriteriaDTO) {
        return ResponseEntity.ok().body(apartmentService.fetchApartments(searchApartmentCriteriaDTO));
    }




}
