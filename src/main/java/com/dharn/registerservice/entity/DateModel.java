package com.dharn.registerservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
public class DateModel {

    @Id
    @GeneratedValue
    private int dateId;
    private Date date;
    private Timestamp time;
  /*  @ManyToOne
    private User user;*/
    private int userId;

}
