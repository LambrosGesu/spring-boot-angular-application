package gr.apartment.webapp.service.impl;

import gr.apartment.webapp.domain.Apartment;
import gr.apartment.webapp.dto.ApartmentDTO;
import gr.apartment.webapp.dto.SearchApartmentCriteriaDTO;
import gr.apartment.webapp.mappers.ApartmentMapper;
import gr.apartment.webapp.repository.ApartmentRepository;
import gr.apartment.webapp.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ApartmentServiceImpl implements ApartmentService {

    @Autowired
    ApartmentRepository apartmentRepository;

    @Autowired
    ApartmentMapper apartmentMapper;

    @Override
    public Page<ApartmentDTO> findAll(Pageable pageable) {
        Page<Apartment> apartmentsPage = apartmentRepository.findAll(pageable);
        return apartmentsPage.map(a -> apartmentMapper.mapApartmentToApartmentDTO(a));
    }

    @Override
    public ApartmentDTO findById(String id) {
        return apartmentRepository.findById(Long.valueOf(id)).map(a ->apartmentMapper.mapApartmentToApartmentDTO(a)).orElse(null);
    }

    @Override
    public List<ApartmentDTO> fetchApartments(SearchApartmentCriteriaDTO searchApartmentCriteriaDTO) {
        return null;
    }

    @Override
    public List<ApartmentDTO> findByHost(Long id) {
        return apartmentRepository.findAllByHostId(id)
                .stream()
                .map(a ->apartmentMapper.mapApartmentToApartmentDTO(a))
                .collect(Collectors.toList());
    }

    @Override
    public ApartmentDTO findByAddress(String address) {
        return null;
    }

    @Override
    public void create(ApartmentDTO apartmentDTO) {
        apartmentRepository.save(apartmentMapper.mapApartmentDtoToApartment(apartmentDTO));
    }

    @Override
    public void update(Long id, ApartmentDTO apartmentDTO) {
        Optional<Apartment> apartment = apartmentRepository.findById(id);
        if (apartment.isPresent()){
            apartmentRepository.save(apartmentMapper.mapApartmentDtoToApartment(apartmentDTO));
        }
    }

    @Override
    public void deleteById(Long id) {
        apartmentRepository.deleteById(id);
    }
}
