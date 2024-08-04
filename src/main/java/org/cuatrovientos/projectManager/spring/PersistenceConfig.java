package org.cuatrovientos.projectManager.spring;

import org.cuatrovientos.projectManager.persistence.imp.ProjectRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfig {

    @Bean
    public ProjectRepositoryImpl projectRepository() {
        return new ProjectRepositoryImpl();
    }

}