package com.endavacourse.filmpreference.service;

import com.endavacourse.filmpreference.model.User;
import com.endavacourse.filmpreference.model.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getAll(UserRepository repository) {
        if (repository.findAll().isEmpty()) {
            repository.save(new User("Nick"));
            repository.save(new User("Daniel"));
            repository.save(new User("Alex"));
        }

        return repository.findAll();
    }
}
