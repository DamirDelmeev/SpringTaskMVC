package home.task.spring.services.impl;

import home.task.spring.model.Project;
import home.task.spring.repository.ProjectRepository;
import home.task.spring.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProject() {
        return projectRepository.getAllProject();
    }

    @Override
    public Project getProjectById(Long id) {
        return projectRepository.getProjectById(id);
    }

    @Override
    public void addProject(Project project) {
        projectRepository.addProject(project);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteProject(id);
    }
}
