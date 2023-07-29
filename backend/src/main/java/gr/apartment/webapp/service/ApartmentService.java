package gr.apartment.webapp.service;

import gr.apartment.webapp.dto.ApartmentDTO;
import gr.apartment.webapp.dto.SearchApartmentCriteriaDTO;

import java.util.List;

public interface ApartmentService {
    List<ApartmentDTO> findAll();

    List<ApartmentDTO> fetchApartments(SearchApartmentCriteriaDTO searchApartmentCriteriaDTO);
    List<ApartmentDTO> findByHost(Long id);
    ApartmentDTO findByAddress(String address);
    void create(ApartmentDTO apartmentDTO);
    void update(Long id, ApartmentDTO apartmentDTO);
    void deleteById(Long id);
}
