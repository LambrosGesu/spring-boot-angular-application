package gr.apartment.webapp.domain;

import gr.apartment.webapp.enums.Gender;
import gr.apartment.webapp.enums.UserRole;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "USERS")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", insertable = false, updatable = false)
    private Long id;

    @Column(name = "USERNAME", nullable = false, length = 250)
    private String username;

    @Column(name = "PASSWORD", nullable = false, length = 250)
    private String password;

    @Column(name = "EMAIL", length = 250)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE", nullable = false, length = 25)
    private UserRole role;

    @Column(name = "FIRSTNAME", nullable = false)
    private String firstname;

    @Column(name = "LASTNAME", nullable = false)
    private String lastname;

    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    @Column(name = "GENDER")
    private Gender gender;

    @Column(name="CREATED_ON")
    private LocalDateTime createdOn;

    @Column(name="UPDATED_ON")
    private LocalDateTime updatedOn;
}