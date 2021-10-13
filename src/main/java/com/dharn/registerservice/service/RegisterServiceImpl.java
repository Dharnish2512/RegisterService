package com.dharn.registerservice.service;


import com.dharn.registerservice.entity.DateModel;
import com.dharn.registerservice.entity.User;
import com.dharn.registerservice.repository.DateRepository;
import com.dharn.registerservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final DateRepository dateRepository;

    public RegisterServiceImpl(UserRepository userRepository, DateRepository dateRepository) {
        this.userRepository = userRepository;
        this.dateRepository = dateRepository;
    }


    @Override
    public User addUser(final User user) {
        User save = userRepository.save(user);
        User userByEmail = userRepository.findUserByEmail(user.getEmail());
        final DateModel dateModel = new DateModel();
        dateModel.setDate(GetDate());
        dateModel.setTime(GetTime());
        dateModel.setUserId(userByEmail.getUserId());
        dateRepository.save(dateModel);
        return save;
    }
    private Date GetDate() {
        java.util.Date date=new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(date.getTime());
        return sqlDate;
    }
    private Timestamp GetTime() {
        java.util.Date date=new java.util.Date();
        java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
        return sqlTime;
    }

    @Override
    public User getUsers(final String email) {
        User userByEmail = userRepository.findUserByEmail(email);
        final DateModel dateModel = new DateModel();
        dateModel.setDate(GetDate());
        dateModel.setTime(GetTime());

        dateModel.setUserId(userByEmail.getUserId());
        dateRepository.save(dateModel);
        return userByEmail;
    }

    @Override
    public List<DateModel> getLoginDate(int userId) {
        return dateRepository.findAllByUserId(userId);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findUserByUserId(id);
    }
}
