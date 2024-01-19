package fr.kevin.exam.service;

import fr.kevin.exam.entity.Model;
import fr.kevin.exam.repository.ModelRepository;
import fr.kevin.exam.service.interfaces.DAOServiceInterface;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModelService implements DAOServiceInterface<Model> {

    private ModelRepository modelRepository;

    @Override
    public List<Model> findAll() {
        return modelRepository.findAll();
    }

    @Override
    public Model getObjectById(Long id) {
        return modelRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

}
