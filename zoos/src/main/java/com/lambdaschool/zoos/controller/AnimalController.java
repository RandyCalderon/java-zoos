package com.lambdaschool.zoos.controller;

import com.lambdaschool.zoos.model.Animal;
import com.lambdaschool.zoos.repository.AnimalRepository;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "Animals Endpoint", description = "List all animals and get animal by aname")
@RestController
@RequestMapping(value = "/animals", produces = MediaType.APPLICATION_JSON_VALUE)
public class AnimalController {



    @Autowired
    AnimalRepository animalrepos;

    @ApiOperation(value = "List All  Customers", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resources you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach can not be found")
    })

    @GetMapping
    public List<Animal> listAllAnimals() {
        return animalrepos.findAll();
    }

    @ApiOperation(value = "Get animal by name", response = Animal.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resources you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach can not be found")
    })
    @GetMapping("/{name}")
    public Animal findAnimalByName(@ApiParam(value="Input for animal name", required = true) @PathVariable String name) {
        return animalrepos.findByName(name);
    }
}
