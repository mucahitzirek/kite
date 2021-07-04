package com.kite.backend.dto;

import com.kite.backend.model.User;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserSaveDTO {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String about;

    public UserSaveDTO(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.about = user.getAbout(); }
}



