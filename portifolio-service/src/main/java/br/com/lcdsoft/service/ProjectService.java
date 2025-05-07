package br.com.lcdsoft.service;


import br.com.lcdsoft.domain.model.Project;
import br.com.lcdsoft.domain.ports.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository repo;

    public ProjectService(ProjectRepository repo) {
        this.repo = repo;
    }

    public Project save(Project project) {
        return repo.save(project);
    }

    public List<Project> getAll() {
        return repo.findAll();
    }
}
