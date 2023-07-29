package gr.apartment.webapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "REVIEW")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REVIEW_ID", nullable = false)
    private Long id;

    @Column(name = "COMMENT", nullable = false, length = 2083)
    private String comment;

    @Column(name = "RATE", nullable = false, length = 26)
    private Integer rate;

    @JsonIgnore
    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "APARTMENT_ID")
    private Apartment apartment;

}