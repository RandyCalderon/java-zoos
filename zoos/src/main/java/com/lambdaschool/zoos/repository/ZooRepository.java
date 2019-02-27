package com.lambdaschool.zoos.repository;

import com.lambdaschool.zoos.model.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZooRepository extends JpaRepository<Zoo, Long> {
}
