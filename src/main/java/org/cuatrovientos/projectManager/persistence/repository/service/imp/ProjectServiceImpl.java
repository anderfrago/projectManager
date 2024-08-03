package org.cuatrovientos.projectManager.persistence.repository.service.imp;

import java.util.Optional;

import org.cuatrovientos.projectManager.persistence.IProjectRepository;
import  org.cuatrovientos.projectManager.persistence.model.Project;
import org.cuatrovientos.projectManager.persistence.repository.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;



public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private IProjectRepository projectRepo;

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepo.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepo.save(project);
    }
}