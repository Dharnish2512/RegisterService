package com.dharn.registerservice.service;

import com.dharn.registerservice.entity.LoginModel;
import com.dharn.registerservice.entity.User;
import com.dharn.registerservice.repository.UserRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

class RegisterServiceImplTest {
    /*private RegisterService registerService = Mockito.mock(RegisterService.class);

    private User user = new User();
    private LoginModel loginModel = new LoginModel();
    @MockBean
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        user.setName("Gokul");
        user.setEmail("gokul@gmail.com");
        user.setPassword("Gokul@123");
        user.setPhoneNo("1234567890");
        user.setDoorNo_StreetName("asdfgh");
        loginModel.setEmail("kavin@gmail.com");
        loginModel.setPassword("Kavin@123");
    }

    @Test
    void addUser() {
        Mockito.when(registerService.addUser(user)).thenReturn(user);
        Assert.assertEquals(registerService.addUser(user),user);
    }

    @Test
    void getUsers() {
    }*/
}