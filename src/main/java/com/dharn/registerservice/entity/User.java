package com.dharn.registerservice.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


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
    private double phoneNo;
    //  Date dateOfBirth;
    private String address;

}
