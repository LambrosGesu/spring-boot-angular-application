package gr.apartment.webapp.dto;

import java.util.Date;

public class ReviewDTO {
    private long id;
    private String comment;
    private Date date;
    private int rating;

    private long listingId;
    private String listingTitle;
    private long userId;
    private String userName;
}
