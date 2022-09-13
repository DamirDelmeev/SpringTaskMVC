package home.task.spring.controller;

import home.task.spring.model.Position;
import home.task.spring.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @GetMapping("positions")
    public List<Position> getAllPosition() {
        return positionService.getAllPosition();
    }

    @GetMapping("position/{id}")
    public Position getPositionById(@PathVariable Long id) {
        return positionService.getPositionById(id);
    }

    @PostMapping("position")
    public void addPosition(@RequestBody Position position) {
        positionService.addPosition(position);
    }

    @DeleteMapping("position/{id}")
    public void deletePosition(@PathVariable Long id) {
        positionService.deletePosition(id);
    }
}