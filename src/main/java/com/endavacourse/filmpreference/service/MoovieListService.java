package com.endavacourse.filmpreference.service;

import com.endavacourse.filmpreference.model.MoovieList;
import com.endavacourse.filmpreference.repository.MoovieListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoovieListService {

    @Autowired
    private MoovieListRepository repository;

    public List<MoovieList> getAll() {
        return repository.findAll();
    }
}
