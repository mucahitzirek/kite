package com.kite.backend.controller;

import com.kite.backend.dto.UserViewDTO;
import com.kite.backend.model.User;
import com.kite.backend.service.UserService;
import com.kite.backend.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/1.0")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public UserViewDTO create(@RequestBody User user) {
        return new UserViewDTO(userService.save(user));
    }

    @GetMapping("/user")
    public List<UserViewDTO> getUsers() {
        return userService.getTrainers().stream().map(UserViewDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/user/{id:[0-9]+}")
    public ResponseEntity<UserViewDTO> getUser(@PathVariable long id) {
        final User user = userService.getTrainer(id);
        return ResponseEntity.ok(new UserViewDTO(user));
    }

    @DeleteMapping("/user/{id:[0-9]+}")
    public ResponseEntity<?> delete(@PathVariable long id) {
        userService.delete(id);
        return ResponseEntity.ok(new GenericResponse("ID " + id + "Trainer Deleted"));
    }

}
