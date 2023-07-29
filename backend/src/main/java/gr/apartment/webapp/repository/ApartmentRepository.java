package gr.apartment.webapp.repository;

import gr.apartment.webapp.domain.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
    List<Apartment> findAllByHostId(Long id);
}
