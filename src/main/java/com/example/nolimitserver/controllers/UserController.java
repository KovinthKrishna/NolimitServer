package com.example.nolimitserver.controllers;

import com.example.nolimitserver.entities.User;
import com.example.nolimitserver.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
