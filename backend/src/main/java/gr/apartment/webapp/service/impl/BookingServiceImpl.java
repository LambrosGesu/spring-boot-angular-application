package gr.apartment.webapp.service.impl;

import gr.apartment.webapp.dto.BookInfoDTO;
import gr.apartment.webapp.service.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingServiceImpl implements BookingService {


    @Override
    public List<BookInfoDTO> findAll() {
        return null;
    }

    @Override
    public BookInfoDTO findBookingById(Long id) {
        return null;
    }

    @Override
    public void deleteBookingById(Long id) {
    }

    @Override
    public List<BookInfoDTO> updateBooking() {
        return null;
    }
}
