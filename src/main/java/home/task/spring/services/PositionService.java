package home.task.spring.services;

import home.task.spring.model.Position;

import java.util.List;

public interface PositionService {

    List<Position> getAllPosition();

    Position getPositionById(Long id);

    void addPosition(Position position);

    void deletePosition(Long id);

}
