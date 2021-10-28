package com.dharn.registerservice.service;

import com.dharn.registerservice.entity.User;


public interface RegisterService {
    User addUser(User user);

    User getUsers(String email);

    User getUserById(int id);

    void updateUser(final User user);
}
