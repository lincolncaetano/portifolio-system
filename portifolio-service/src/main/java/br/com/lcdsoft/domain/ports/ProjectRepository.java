package br.com.lcdsoft.domain.ports;



import br.com.lcdsoft.domain.model.Project;

import java.util.List;

public interface ProjectRepository {
    Project save(Project project);
    List<Project> findAll();
}
