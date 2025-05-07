package br.com.lcdsoft.infrastructure.controller;

import br.com.lcdsoft.application.service.UserService;
import br.com.lcdsoft.domain.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        return ResponseEntity.ok(service.createUser(user));
    }

    @GetMapping
    public ResponseEntity<User> byUsername(@RequestParam String username) {
        return ResponseEntity.ok(service.getUser(username));
    }
}
