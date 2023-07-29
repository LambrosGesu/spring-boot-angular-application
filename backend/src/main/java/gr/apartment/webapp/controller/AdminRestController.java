package gr.apartment.webapp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import gr.apartment.webapp.dto.BookInfoDTO;
import gr.apartment.webapp.dto.UserDTO;
import gr.apartment.webapp.service.BookingService;
import gr.apartment.webapp.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/admin")
//@PreAuthorize("hasRole('ADMIN')")
public class AdminRestController {

    private final UserService userService;
    private final BookingService bookingService;

    @Autowired
    public AdminRestController(UserService userService, BookingService bookingService) {
        this.userService = userService;
        this.bookingService = bookingService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDTO> findUserById(@PathVariable("id") Long id) throws JsonProcessingException {
        UserDTO userDto = new ModelMapper().map(userService.findById(id), UserDTO.class);
        return ResponseEntity.ok().body(userDto);
    }

    @PutMapping("/users")
    public ResponseEntity<String> updateUser(@RequestBody @Nullable UserDTO userDto) throws JsonProcessingException {
        return ResponseEntity.ok().body("{\"Status\": \"Update Successful\"}");
    }

    @PostMapping("/users/{id}/approve")
    public ResponseEntity<String> approveUser(@PathVariable("id") Long id) {
//        userService.approve(id);

        return ResponseEntity.ok().body("{\"Status\": \"User Approved\"}");
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return ResponseEntity.ok().body("{\"Status\": \"Delete Successful\"}");
    }

    @GetMapping("/users/unApproved")
    public ResponseEntity<List<UserDTO>> getUnapprovedUsers(){
        return ResponseEntity.ok().body(null);
    }

    // --------------------------- Bookings ----------------------------
    @GetMapping("/bookings")
    public ResponseEntity<List<BookInfoDTO>> returnAllBookings(){
        return ResponseEntity.ok().body(bookingService.findAll());
    }

    @GetMapping("/bookings/{id}")
    public ResponseEntity<BookInfoDTO> returnBookingById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok().body(bookingService.findBookingById(id));
    }

//    @PutMapping("/bookings/{id}")
//    public ResponseEntity<List<BookInfoDTO>> updateBooking(@PathVariable("id") Long id, @RequestBody @com.sun.istack.Nullable BookInfoDTO bookInfoDTO) throws JsonProcessingException {
//        if(bookInfoDTO!=null)
//            return ResponseEntity.ok().body(Helpers.convertToJson(bookingService.updateBooking(bookInfoDTO)));
//        else
//            return ResponseEntity.badRequest().body("{\"Status\": \"Booking not found\"}");
//    }

    @DeleteMapping("/bookings/{id}")
    public ResponseEntity<String> deleteBookingById(@PathVariable("id") Long id){
        bookingService.deleteBookingById(id);
        return ResponseEntity.ok().body("{\"Status\": \"Successful Deletion\"}");
    }

}
