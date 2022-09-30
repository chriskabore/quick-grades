package com.kirasoft.quickgrades.users.dtos;

import com.kirasoft.quickgrades.users.model.User;
import lombok.Data;

@Data
public class UserDTO {

    private Long userId;

    private String username;

    private String firstName;

    private String middleName;

    private String lastName;

    private String password;

    private String emailAddress;

    private String dateOfBirth;
    private String gender;

    public UserDTO(User user){
        if(user!=null){
            userId = user.getUserId();
            username = user.getUsername();
            firstName = user.getFirstName();
            middleName = user.getMiddleName();
            lastName = user.getLastName();
            emailAddress = user.getEmailAddress();
            dateOfBirth = user.getDateOfBirth();
            gender = user.getGender().name();
        }
    }
}
