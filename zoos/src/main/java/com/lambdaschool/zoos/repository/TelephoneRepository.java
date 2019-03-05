package com.lambdaschool.zoos.repository;

import com.lambdaschool.zoos.model.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelephoneRepository extends JpaRepository<Telephone, Long> {
}
