package com.dharn.registerservice.service;


import com.dharn.registerservice.entity.User;
import com.dharn.registerservice.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;


@Service
public class RegisterServiceImpl implements RegisterService {

    private final UserRepository userRepository;

    public RegisterServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {RuntimeException.class, SQLException.class})
    public User addUser(final User user) {
        user.setLastLogin(GetDate());
        user.setTime(GetTime());
        final User save = userRepository.save(user);
        return save;
    }

    private Date GetDate() {
        final java.util.Date date = new java.util.Date();
        final java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }

    private Timestamp GetTime() {
        final java.util.Date date = new java.util.Date();
        final java.sql.Timestamp sqlTime = new java.sql.Timestamp(date.getTime());
        return sqlTime;
    }

    @Override
    public User getUsers(final String email) {
        final User userByEmail = userRepository.findUserByEmail(email);
        return userByEmail;
    }

    @Override
    public void updateUser(final User user) {
        final User dbUser = userRepository.findUserByEmail(user.getEmail());
        dbUser.setLastLogin(GetDate());
        dbUser.setTime(GetTime());
        userRepository.save(dbUser);
    }

    @Override
    public User getUserById(final int id) {
        return userRepository.findUserByUserId(id);
    }
}
