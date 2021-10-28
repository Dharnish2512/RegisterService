package com.dharn.registerservice.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private int userId;
    @ApiModelProperty(notes = "Name of the User")
    private String name;
    private String email;
    private String password;
    private String phoneNo;
    private String doorNo_StreetName;
    private String district;
    private String state;
    private int pincode;
    private String country;
    private Date lastLogin;
    private Timestamp time;

    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "User_Id", referencedColumnName = "userId")
    private List<DateModel> dateList = new ArrayList<>();*/


    public User(int userId, String name, String email, String password, String phoneNo, String doorNo_StreetName, String district, String state, int pincode, String country, Date lastLogin, Timestamp time) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNo = phoneNo;
        this.doorNo_StreetName = doorNo_StreetName;
        this.district = district;
        this.state = state;
        this.pincode = pincode;
        this.country = country;
        this.lastLogin = lastLogin;
        this.time = time;
    }

    public User() {

    }

    public User copy() {
        return new User(userId, name, email, password, phoneNo, doorNo_StreetName, district, state, pincode, country, lastLogin, time);
    }

}
