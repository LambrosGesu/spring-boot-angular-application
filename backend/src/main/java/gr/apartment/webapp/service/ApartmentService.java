package gr.apartment.webapp.service;

import gr.apartment.webapp.dto.ApartmentDTO;
import gr.apartment.webapp.dto.SearchApartmentCriteriaDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ApartmentService {
    Page<ApartmentDTO> findAll(Pageable pageable);
    ApartmentDTO findById(String id);
    List<ApartmentDTO> fetchApartments(SearchApartmentCriteriaDTO searchApartmentCriteriaDTO);
    List<ApartmentDTO> findByHost(Long id);
    ApartmentDTO findByAddress(String address);
    void create(ApartmentDTO apartmentDTO);
    void update(Long id, ApartmentDTO apartmentDTO);
    void deleteById(Long id);
}
