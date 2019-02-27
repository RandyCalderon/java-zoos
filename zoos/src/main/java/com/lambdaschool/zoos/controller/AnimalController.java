package com.lambdaschool.zoos.controller;

import com.lambdaschool.zoos.model.Animal;
import com.lambdaschool.zoos.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/animals", produces = MediaType.APPLICATION_JSON_VALUE)
public class AnimalController {

    @Autowired
    AnimalRepository animalrepos;

    @GetMapping
    public List<Animal> listAllAnimals() {
        return animalrepos.findAll();
    }

    @GetMapping("/{name}")
    public Animal findAnimalByName(@PathVariable String name) {
        return animalrepos.findByName(name);
    }
}
