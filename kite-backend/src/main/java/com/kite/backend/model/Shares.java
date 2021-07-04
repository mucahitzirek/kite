package com.kite.backend.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "shares")
@ToString
public class Shares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String header;

    @NotNull
    private String content; // only trainings?

    private String comments;

    @ManyToOne
    private Subject subject;

}
