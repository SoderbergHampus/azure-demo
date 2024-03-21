package org.example.backend.controller;

import org.example.backend.DTOs.DogListDTO;
import org.example.backend.service.DogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dogs")
@CrossOrigin
public class DogController {

    private final DogService service;

    public DogController(DogService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<DogListDTO> getDogs() {
        return ResponseEntity.ok(DogListDTO.fromDogs(service.getDogs()));
    }
}
