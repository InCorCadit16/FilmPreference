package com.endavacourse.filmpreference.repository;

import com.endavacourse.filmpreference.model.UserList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserListRepository extends JpaRepository<UserList, Long> {

    @Override
    Optional<UserList> findById(Long aLong);

    @Override
    List<UserList> findAll();
}
