package org.cuatrovientos.projectManager.persistence;

import java.util.Optional;

import org.cuatrovientos.projectManager.persistence.model.Project;

public interface IProjectRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);
}