package com.lambdaschool.zoos.controller;

import com.lambdaschool.zoos.model.Zoo;
import com.lambdaschool.zoos.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/zoo", produces = MediaType.APPLICATION_JSON_VALUE)
public class ZooController {
    @Autowired
    ZooRepository zoorepos;

    @GetMapping
    public List<Zoo> listAllZoos() {
        return zoorepos.findAll();
    }

    @PutMapping

}
