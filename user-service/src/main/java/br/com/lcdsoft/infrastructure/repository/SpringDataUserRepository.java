package br.com.lcdsoft.infrastructure.repository;

import br.com.lcdsoft.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SpringDataUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
