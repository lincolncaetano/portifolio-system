package br.com.lcdsoft.application.service;

import br.com.lcdsoft.domain.model.User;
import br.com.lcdsoft.domain.ports.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User createUser(User user) {
        return repo.save(user);
    }

    public User getUser(String username) {
        return repo.findByUsername(username).orElseThrow();
    }
}
