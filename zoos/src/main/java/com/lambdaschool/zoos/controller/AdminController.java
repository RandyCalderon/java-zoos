package com.lambdaschool.zoos.controller;

import com.lambdaschool.zoos.repository.AnimalRepository;
import com.lambdaschool.zoos.repository.TelephoneRepository;
import com.lambdaschool.zoos.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/admin", produces = MediaType.APPLICATION_JSON_VALUE)
public class AdminController {
    @Autowired
    AnimalRepository animalrepos;

    @Autowired
    TelephoneRepository phonerepos;

    @Autowired
    ZooRepository zoorepos;


}
