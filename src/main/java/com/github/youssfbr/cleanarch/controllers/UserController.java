package com.github.youssfbr.cleanarch.controllers;

import com.github.youssfbr.cleanarch.models.User;
import com.github.youssfbr.cleanarch.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    User create(@RequestBody User user) {
        return userService.create(user);
    }
}
