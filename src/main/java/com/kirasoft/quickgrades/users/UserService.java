package com.kirasoft.quickgrades.users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers(){
        return List.of(
                new User(1L,"ldamiba", "Laurent", "Wendkuuni", "Damiba","secret", "ldamiba@kirasoft.com",Gender.MALE),
                new User(2L,"hkouakou", "Hortense", "Marie","Kouakou","secret", "hkouakou@kirasoft.com",Gender.FEMALE),
                new User(3L,"chriskabor", "Sidnooma", "Christian", "Kabore","secret", "chriskabor@kirasoft.com",Gender.MALE)
        );
    }
}
