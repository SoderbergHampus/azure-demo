package org.example.backend.DTOs;

import org.example.backend.model.Dog;

import java.util.List;

public record DogListDTO(List<DogDTO> dogs) {
    public static DogListDTO fromDogs(List<Dog> dogs) {
        return new DogListDTO(dogs.stream().map(DogDTO::fromDog).toList());
    }
}
