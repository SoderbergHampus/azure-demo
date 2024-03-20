package org.example.backend.repository;

import org.example.backend.model.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<Hello, Integer> {
}
