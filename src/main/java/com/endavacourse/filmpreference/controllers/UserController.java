package com.endavacourse.filmpreference.controllers;

import com.endavacourse.filmpreference.model.User;
import com.endavacourse.filmpreference.model.UserRepository;
import com.endavacourse.filmpreference.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository repository;

    @GetMapping
    @RequestMapping("/users")
    List<User> getUsers() {
        return userService.getAll(repository);
    }

}