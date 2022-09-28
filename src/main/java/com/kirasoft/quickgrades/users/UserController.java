package com.kirasoft.quickgrades.users;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping(produces ="application/json")
    public List<User> getAllUsers(){
        return List.of(
                new User(1L,"ldamiba", "Laurent", "Wendkuuni", "Damiba","secret", "ldamiba@kirasoft.com",Gender.MALE),
                new User(2L,"hkouakou", "Hortense", "Marie","Kouakou","secret", "hkouakou@kirasoft.com",Gender.FEMALE),
                new User(3L,"chriskabor", "Sidnooma", "Christian", "Kabore","secret", "chriskabor@kirasoft.com",Gender.MALE)
        );
    }
}
