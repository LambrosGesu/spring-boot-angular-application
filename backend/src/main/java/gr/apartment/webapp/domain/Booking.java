package gr.apartment.webapp.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "BOOKING")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOKING_ID", nullable = false)
    private Long id;

    @Column(name = "BOOKING_START_DATE", nullable = false)
    private LocalDate dateIn;

    @Column(name = "BOOKING_END_DATE", nullable = false)
    private LocalDate dateOut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="APARTMENT_ID", nullable = false)
    @ToString.Exclude
    private Apartment apartment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="USER_ID", nullable = false)
    @ToString.Exclude
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Booking booking = (Booking) o;
        return id != null && Objects.equals(id, booking.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
