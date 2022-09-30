package com.kirasoft.quickgrades.users.controller;

import com.kirasoft.quickgrades.users.service.impl.UserServiceImpl;
import com.kirasoft.quickgrades.users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("users")
public class UserController {

    private UserServiceImpl userServiceImpl;


    @Autowired
    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping(produces ="application/json")
    public List<User> getAllUsers(){
        return userServiceImpl.getAllUsers();
    }
}
