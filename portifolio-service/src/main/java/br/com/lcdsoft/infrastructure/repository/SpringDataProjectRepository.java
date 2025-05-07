package br.com.lcdsoft.infrastructure.repository;

import br.com.lcdsoft.domain.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataProjectRepository extends JpaRepository<Project, Long> {
}
