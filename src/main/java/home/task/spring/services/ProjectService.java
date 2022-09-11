package home.task.spring.services;

import home.task.spring.model.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getAllProject();

    Project getProjectById(Long id);

    void addProject(Project project);

    void deleteProject(Long id);
}
