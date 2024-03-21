package org.example.backend.service;

import org.example.backend.model.Dog;
import org.example.backend.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    private final DogRepository repo;

    public DogService(DogRepository repo) {
        this.repo = repo;
    }

    public List<Dog> getDogs() {
        return repo.findAll();
    }
}
