package gr.apartment.webapp.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class BookInfoDTO {

    private long reservationId;
    private long bookedHomeId;
    private LocalDate dateIn;
    private LocalDate dateOut;
    private int isBooked;
    private long userIdBooked;
    private String userNameBooked;
    private int hostReviewStars;
    private String hostReviewDescription;
    private int homeReviewStars;
    private String homeReviewDescription;

}