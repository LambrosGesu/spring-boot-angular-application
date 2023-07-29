package gr.apartment.webapp.dto;

import lombok.Data;

import java.util.List;

@Data
public class ApartmentDTO {

    private Long id;
    private Long hostId;
    private String title;
    private String country;
    private String region;
    private List<BookInfoDTO> reservations;
//    private List<Image> images;
    private Boolean cancellation_policy;
    private double price;
    private String address;
    private String latitude;
    private String longitude;
    private String description;
    private Integer squareMeters;
    private double overnightPrice;
    private double costPerExtraGuest;
    private Integer maxPeople;
    private Integer minOvernights;
    private Integer numOfBeds;
    private Integer bathrooms;
    private Integer numOfRooms;
    private Integer numOfWc;
    private boolean livingRoom;
    private boolean elevator;
    private boolean heating;
    private boolean kitchen;
    private boolean parking;
    private boolean tv;
    private boolean wifi;
    private boolean ac;
    private boolean pets;
    private boolean events;
}
