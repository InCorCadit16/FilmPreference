package com.endavacourse.filmpreference.controllers;

import com.endavacourse.filmpreference.model.UserList;
import com.endavacourse.filmpreference.repository.UserListRepository;
import com.endavacourse.filmpreference.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserListService userListService;

    @Autowired
    private UserListRepository repository;

    @GetMapping
    @RequestMapping("/users")
    List<UserList> getUsers() {
        return userListService.getAll(repository);
    }

}
