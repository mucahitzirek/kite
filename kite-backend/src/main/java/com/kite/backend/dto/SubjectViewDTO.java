package com.kite.backend.dto;

import com.kite.backend.model.Subject;
import lombok.*;

@Getter
@Setter
@ToString
public class SubjectViewDTO {

    private String name;

    public SubjectViewDTO(Subject subject){
        this.name=subject.getName();
    }

}
