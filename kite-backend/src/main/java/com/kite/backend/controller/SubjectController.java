package com.kite.backend.controller;

import com.kite.backend.dto.SubjectViewDTO;
import com.kite.backend.model.Subject;
import com.kite.backend.service.SubjectService;
import com.kite.backend.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/1.0/")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/subject")
    public SubjectViewDTO create(@RequestBody Subject subject){
        return new SubjectViewDTO(subjectService.save(subject));
    }

    @GetMapping("/subjects")
    public List<SubjectViewDTO> getSubjects(){
        return subjectService.getSubjects().stream().map(SubjectViewDTO::new).collect(Collectors.toList());
    }

    @DeleteMapping("/subject/{id:[0-9]+}")
    public ResponseEntity<?> delete(@PathVariable long id){
        subjectService.delete(id);
        return ResponseEntity.ok(new GenericResponse("ID " + id + "Subject Deleted"));
    }
}
