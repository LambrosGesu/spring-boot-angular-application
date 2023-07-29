package gr.apartment.webapp.dto;

import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@Getter
public class SearchApartmentCriteriaDTO implements Serializable {

    private Date startDate;
    private Date endDate;
    private int guests;
    private String country;
    private String city;

//    private RoomType type;
    private Double maxCost;
    private Boolean wifi;
    private Boolean ac;
    private Boolean heating;
    private Boolean kitchen;
    private Boolean tv;
    private Boolean parking;
    private Boolean elevator;
}
