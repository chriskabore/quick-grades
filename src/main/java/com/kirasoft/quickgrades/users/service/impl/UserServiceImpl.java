package com.kirasoft.quickgrades.users.service.impl;

import com.kirasoft.quickgrades.users.model.User;
import com.kirasoft.quickgrades.users.repository.UserRepository;
import com.kirasoft.quickgrades.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
