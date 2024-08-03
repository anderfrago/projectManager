package org.cuatrovientos.projectManager.persistence.repository.service;


import java.util.Optional;

import org.cuatrovientos.projectManager.persistence.model.Project;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);
}
