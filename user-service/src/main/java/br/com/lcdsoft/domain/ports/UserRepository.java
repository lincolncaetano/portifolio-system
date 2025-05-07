package br.com.lcdsoft.domain.ports;

import br.com.lcdsoft.domain.model.User;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUsername(String username);
    User save(User user);
}
