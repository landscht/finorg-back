package com.api.finorgback.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileId;
    private String firstname;
    private String lastname;
    private LocalDate birthday;

    public Profile() {}

    public Profile(Long profileId, String firstname, String lastname, LocalDate birthday) {
        this.profileId = profileId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long id) {
        this.profileId = id;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
