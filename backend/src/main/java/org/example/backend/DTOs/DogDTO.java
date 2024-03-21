package org.example.backend.DTOs;

import org.example.backend.model.Dog;

public record DogDTO(int id, String name, String description, String imgRef) {
    public static DogDTO fromDog(Dog dog) {
        return new DogDTO(dog.getId(), dog.getName(), dog.getDescription(), dog.getImgRef());
    }

    public static Dog toDog(DogDTO dto) {
        return new Dog(dto.name(), dto.description(), dto.imgRef());
    }
}
