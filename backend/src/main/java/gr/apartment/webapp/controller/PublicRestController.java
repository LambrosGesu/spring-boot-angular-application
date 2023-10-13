package gr.apartment.webapp.controller;

import gr.apartment.webapp.dto.ApartmentDTO;
import gr.apartment.webapp.dto.SearchApartmentCriteriaDTO;
import gr.apartment.webapp.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/public-api")
public class PublicRestController {

    @Autowired
    ApartmentService apartmentService;

    @GetMapping("/apartments")
    public ResponseEntity<Page<ApartmentDTO>> getAllApartments(Pageable pageable) {
        Page<ApartmentDTO> apartmentsPage = apartmentService.findAll(pageable);
        return ResponseEntity.ok().body(apartmentsPage);
    }

    @GetMapping("/apartments/filtered")
    public ResponseEntity<List<ApartmentDTO>> getFilteredApartments(@RequestBody SearchApartmentCriteriaDTO searchApartmentCriteriaDTO) {
        return ResponseEntity.ok().body(apartmentService.fetchApartments(searchApartmentCriteriaDTO));
    }

    @GetMapping("/apartment/{id}/reviews")
    public ResponseEntity<String> reviews(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok().body(null);
    }
}
