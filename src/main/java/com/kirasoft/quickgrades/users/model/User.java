package com.kirasoft.quickgrades.users.model;

import com.kirasoft.quickgrades.users.dtos.Gender;
import com.kirasoft.quickgrades.users.dtos.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long userId;

    private String username;

    private String firstName;

    private String middleName;

    private String lastName;

    private String password;

    private String emailAddress;

    private String dateOfBirth;



    @Enumerated
    @Column(columnDefinition = "int")
    private Gender gender;


    public User(String username, String firstName, String middleName,
                String lastName, String password, String emailAddress, String dateOfBirth, Gender gender) {
        this.username = username;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

}
