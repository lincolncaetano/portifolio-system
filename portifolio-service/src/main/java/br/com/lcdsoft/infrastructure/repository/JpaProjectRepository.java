package br.com.lcdsoft.infrastructure.repository;


import br.com.lcdsoft.domain.model.Project;
import br.com.lcdsoft.domain.ports.ProjectRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaProjectRepository implements ProjectRepository {

    private final SpringDataProjectRepository repo;

    public JpaProjectRepository(SpringDataProjectRepository repo) {
        this.repo = repo;
    }

    @Override
    public Project save(Project project) {
        return repo.save(project);
    }

    @Override
    public List<Project> findAll() {
        return repo.findAll();
    }
}
