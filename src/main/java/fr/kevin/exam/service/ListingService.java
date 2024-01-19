package fr.kevin.exam.service;

import fr.kevin.exam.entity.Listing;
import fr.kevin.exam.repository.ListingRepository;
import fr.kevin.exam.service.interfaces.DAOServiceInterface;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ListingService implements DAOServiceInterface<Listing> {

    private ListingRepository listingRepository;

    @Override
    public List<Listing> findAll() {
        return listingRepository.findAll();
    }

    public List<Listing> findTop12ByOrderByCreatedAtDesc() {
        return listingRepository.findTop12ByOrderByCreatedAtDesc();
    }

    @Override
    public Listing getObjectById(Long id) {
        return listingRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

}
