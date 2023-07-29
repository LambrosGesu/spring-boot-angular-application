package gr.apartment.webapp.dto;

import com.sun.istack.NotNull;
import gr.apartment.webapp.enums.UserRole;

import javax.persistence.Lob;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class UserDTO {
//    private long id;

    @NotNull
    @NotEmpty
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private Set<UserRole> roles;
    private Boolean approved;
    private Date creationDate;
    private Date updateDate;
    @Lob
    private Byte[] image;
    private List<ApartmentDTO> myApartments;
    private List<ReviewDTO> reviews;
    private List<BookInfoDTO> bookings;

    public UserDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Set<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<UserRole> roles) {
        this.roles = roles;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
