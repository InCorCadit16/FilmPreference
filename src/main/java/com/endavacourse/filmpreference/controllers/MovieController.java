package com.endavacourse.filmpreference.controllers;

import com.endavacourse.filmpreference.model.MoovieList;
import com.endavacourse.filmpreference.service.MoovieListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class MovieController {

    @Autowired
    private MoovieListService moovieListService;

    @GetMapping("/movies")
    @ResponseBody
    public List<MoovieList> movies() {
        return moovieListService.getAll();
    }

}
