package com.dharn.registerservice.service;

import com.dharn.registerservice.entity.LoginModel;
import com.dharn.registerservice.entity.User;

import java.util.List;

public interface RegisterService {
    void addUser(User user);
    List<User> getUsers();
}
