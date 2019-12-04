package com.endavacourse.filmpreference.repository;

import com.endavacourse.filmpreference.model.MoovieList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MoovieListRepository extends JpaRepository<MoovieList, Long> {

    @Override
    Optional<MoovieList> findById(Long id);

    Optional<MoovieList> findByName(String name);

    @Override
    List<MoovieList> findAll();
}
