package com.kite.backend.model;

import com.sun.istack.NotNull;
import lombok.*;
import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "user")
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String firstName;

    private String lastName;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @Column(length = 10000)
    private String about;

}



