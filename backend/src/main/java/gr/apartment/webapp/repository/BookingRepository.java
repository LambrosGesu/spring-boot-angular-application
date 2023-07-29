package gr.apartment.webapp.repository;

import gr.apartment.webapp.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
