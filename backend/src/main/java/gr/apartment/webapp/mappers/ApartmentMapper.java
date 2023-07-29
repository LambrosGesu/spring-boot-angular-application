package gr.apartment.webapp.mappers;

import gr.apartment.webapp.domain.Apartment;
import gr.apartment.webapp.dto.ApartmentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApartmentMapper {
    @Autowired
    private ModelMapper modelMapper;


    public ApartmentDTO mapApartmentToApartmentDTO(Apartment apartment) {
        return modelMapper.map(apartment, ApartmentDTO.class);
    }

    public Apartment mapApartmentDtoToApartment(ApartmentDTO apartmentDTO) {
        return modelMapper.map(apartmentDTO, Apartment.class);
    }

}
