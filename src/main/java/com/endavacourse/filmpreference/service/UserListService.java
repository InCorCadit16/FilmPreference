package com.endavacourse.filmpreference.service;

import com.endavacourse.filmpreference.model.UserList;
import com.endavacourse.filmpreference.repository.UserListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserListService {

    public List<UserList> getAll(UserListRepository repository) {

        return repository.findAll();
    }
}
