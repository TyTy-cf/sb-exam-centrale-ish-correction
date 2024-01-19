package fr.kevin.exam.service.interfaces;

import java.util.List;

public interface DAOServiceInterface<T> {

    List<T> findAll();

    T getObjectById(Long id);

}
