package home.task.spring.controller;

import home.task.spring.model.Position;
import home.task.spring.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping()
public class PositionController {
    @Autowired
    TaskService taskService;

    @GetMapping("positions")
    public List<Position> getAllPosition() {
        return taskService.getAllPosition();
    }

    @GetMapping("position/{id}")
    public Position getPositionById(@PathVariable Long id) {
        return taskService.getPositionById(id);
    }

    @PostMapping("position")
    public void addPosition(@RequestBody Position position) {
        taskService.addPosition(position);
    }

    @DeleteMapping("position/{id}")
    public void deletePosition(@PathVariable Long id) {
        taskService.deletePosition(id);
    }
}