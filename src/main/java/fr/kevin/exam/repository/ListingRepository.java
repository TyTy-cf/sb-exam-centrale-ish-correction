package fr.kevin.exam.repository;

import fr.kevin.exam.entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListingRepository extends JpaRepository<Listing, Long> {

    List<Listing> findTop12ByOrderByCreatedAtDesc();

}