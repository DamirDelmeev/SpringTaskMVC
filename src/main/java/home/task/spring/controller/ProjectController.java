package home.task.spring.controller;

import home.task.spring.model.Project;
import home.task.spring.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping()
public class ProjectController {
    @Autowired
    TaskService taskService;

    @GetMapping("projects")
    public List<Project> getAllProject() {
        return taskService.getAllProject();
    }

    @GetMapping("project/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return taskService.getProjectById(id);
    }

    @PostMapping("project")
    public void addProject(@RequestBody Project project) {
        taskService.addProject(project);
    }

    @DeleteMapping("project/{id}")
    public void deleteProject(@PathVariable Long id) {
        taskService.deleteProject(id);
    }
}
