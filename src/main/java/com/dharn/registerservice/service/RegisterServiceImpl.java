package com.dharn.registerservice.service;

import com.dharn.registerservice.entity.LoginModel;
import com.dharn.registerservice.entity.User;
import com.dharn.registerservice.repository.UserRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService{

    @Autowired
    private UserRepository userRepository;
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public void addUser(final User user) {
       userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        List<User> list = (List<User>) userRepository.findAll();
        return list;
    }
}
