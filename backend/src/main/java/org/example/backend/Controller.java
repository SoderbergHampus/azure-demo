package org.example.backend;

import org.example.backend.repository.HelloRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class Controller {

    private final HelloRepository repo;

    public Controller(HelloRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok(this.repo.findAll().get(0).getMsg());
    }
}
