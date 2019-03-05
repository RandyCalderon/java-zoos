package com.lambdaschool.zoos.repository;

import com.lambdaschool.zoos.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    @Query(value = "SELECT * FROM animal WHERE animaltype = :name", nativeQuery = true)
    Animal findByName(@Param("name") String name);
}
