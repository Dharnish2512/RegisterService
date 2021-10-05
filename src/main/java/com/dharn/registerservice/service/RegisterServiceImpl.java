package com.dharn.registerservice.service;


import com.dharn.registerservice.entity.User;
import com.dharn.registerservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RegisterServiceImpl implements RegisterService{

    @Autowired
    private UserRepository userRepository;
    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public void addUser(final User user) {
       userRepository.save(user);
    }

    @Override
    public User getUsers(String email) {
        return userRepository.findUserByEmail(email);
    }
}
