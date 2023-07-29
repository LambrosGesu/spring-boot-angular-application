package gr.apartment.webapp.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "APARTMENT")
public class Apartment {

    private static final int MAX_LENGTH = 60;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "APARTMENT_ID")
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

//    @ManyToOne (fetch = FetchType.LAZY)
    @Column(name ="HOST_ID", nullable = false)
    private Long hostId;

    @Column(name = "COUNTRY", nullable = false, length = MAX_LENGTH)
    private String country;

    @Column(name = "REGION", nullable = false, length = MAX_LENGTH)
    private String region;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DESCRIPTION", length = 2048)
    private String description;

    @Column(name = "CANCELLATION_POLICY")
    private Boolean cancellation_policy;

    @Column(name = "PRICE", nullable = false)
    private Integer price;

    @Column(name = "SCORE", length = 2)
    private Float score;

    @Column(name = "APARTMENT_LAT", nullable = false)
    private String latitude;

    @Column(name = "APARTMENT_LONG", nullable = false)
    private String longitude;

    @Column(name = "NUM_OF_BEDS")
    private int numOfBeds;

    @Column(name = "NUM_OF_ROOMS")
    private int numOfRooms;

    @Column(name = "LIVING_ROOM")
    private boolean livingRoom;

    @Column(name = "NUM_OF_WC")
    private int numOfWc;

    @Column(name = "SQUARE_METRES")
    private double squareMetres;

    @Column(name = "COST_PER_EXTRA_GUEST")
    private double costPerExtraGuest;

    @Column(name = "WIFI")
    private boolean wifi;

    @Column(name = "AC")
    private boolean ac;

    @Column(name = "HEATING")
    private boolean heating;

    @Column(name = "KITCHEN")
    private boolean kitchen;

    @Column(name = "TV")
    private boolean tv;

    @Column(name = "PARKING")
    private boolean parking;

    @Column(name = "ELEVATOR")
    private boolean elevator;

    @OneToMany(mappedBy = "apartment", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, targetEntity = Image.class)
    private List<Image> images;

    @OneToMany(mappedBy = "apartment", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, targetEntity = Booking.class)
    private List<Booking> bookings;

    @OneToMany(mappedBy = "apartment", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, targetEntity = Review.class)
    private List<Review> reviews;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Apartment apartment = (Apartment) o;
        return id != null && Objects.equals(id, apartment.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
