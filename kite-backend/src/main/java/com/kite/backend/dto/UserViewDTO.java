package com.kite.backend.dto;

import com.kite.backend.model.User;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserViewDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String about;

    public UserViewDTO(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.about = user.getAbout(); }
}



