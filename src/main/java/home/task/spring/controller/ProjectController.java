package home.task.spring.controller;

import home.task.spring.model.Project;
import home.task.spring.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("projects")
    public List<Project> getAllProject() {
        return projectService.getAllProject();
    }

    @GetMapping("project/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    @PostMapping("project")
    public void addProject(@RequestBody Project project) {
        projectService.addProject(project);
    }

    @DeleteMapping("project/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }
}
