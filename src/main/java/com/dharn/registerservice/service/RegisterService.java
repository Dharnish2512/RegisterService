package com.dharn.registerservice.service;

import com.dharn.registerservice.entity.DateModel;
import com.dharn.registerservice.entity.User;

import java.util.List;


public interface RegisterService {
    User addUser(User user);

    User getUsers(String email);
    List<DateModel> getLoginDate(int userId);

    User getUserById(int id);
}
