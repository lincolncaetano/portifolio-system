package br.com.lcdsoft.infrastructure.repository;

import br.com.lcdsoft.domain.model.User;
import br.com.lcdsoft.domain.ports.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaUserRepository implements UserRepository {

    private final SpringDataUserRepository repo;

    public JpaUserRepository(SpringDataUserRepository repo) {
        this.repo = repo;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return repo.findByUsername(username);
    }

    @Override
    public User save(User user) {
        return repo.save(user);
    }
}
