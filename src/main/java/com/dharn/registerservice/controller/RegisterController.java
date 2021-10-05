package com.dharn.registerservice.controller;

import com.dharn.registerservice.entity.LoginModel;
import com.dharn.registerservice.entity.User;
import com.dharn.registerservice.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/add")
    public User getUserDetails(@RequestBody final User user) {
        registerService.addUser(user);
        return user;

    }

    @GetMapping("/login/{email}")
    public User getAllUser(@PathVariable final String email) {
        final User users = registerService.getUsers(email);
        return users;
    }
}
