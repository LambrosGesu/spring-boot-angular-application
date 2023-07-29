package gr.apartment.webapp.service;

import gr.apartment.webapp.dto.BookInfoDTO;

import java.util.List;

public interface BookingService {
    List<BookInfoDTO> findAll();
    BookInfoDTO findBookingById(Long id);
    List<BookInfoDTO> updateBooking();
    void deleteBookingById(Long id);
}
