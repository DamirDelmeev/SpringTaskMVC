package home.task.spring.services.impl;

import home.task.spring.model.Position;
import home.task.spring.repository.PositionRepository;
import home.task.spring.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepository positionRepository;

    @Override
    public List<Position> getAllPosition() {
        return positionRepository.getAllPosition();
    }

    @Override
    public Position getPositionById(Long id) {
        return positionRepository.getPositionById(id);
    }

    @Override
    public void addPosition(Position position) {
        positionRepository.addPosition(position);
    }

    @Override
    public void deletePosition(Long id) {
        positionRepository.deletePosition(id);
    }
}
