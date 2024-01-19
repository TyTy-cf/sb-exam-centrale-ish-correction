package fr.kevin.exam.service;

import fr.kevin.exam.entity.User;
import fr.kevin.exam.repository.UserRepository;
import fr.kevin.exam.service.interfaces.DAOServiceInterface;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements DAOServiceInterface<User> {

    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User getObjectById(Long id) {
        return userRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

}
