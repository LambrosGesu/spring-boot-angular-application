package gr.apartment.webapp.repository;

import gr.apartment.webapp.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
