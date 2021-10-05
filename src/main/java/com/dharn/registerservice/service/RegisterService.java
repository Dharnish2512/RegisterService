package com.dharn.registerservice.service;

import com.dharn.registerservice.entity.LoginModel;
import com.dharn.registerservice.entity.User;


public interface RegisterService {
    void addUser(User user);

    User getUsers(String email);
}
