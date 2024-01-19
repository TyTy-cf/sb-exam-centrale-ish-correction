package fr.kevin.exam.service;

import fr.kevin.exam.DTO.BrandDTO;
import fr.kevin.exam.entity.Brand;
import fr.kevin.exam.repository.BrandRepository;
import fr.kevin.exam.service.interfaces.DAOServiceInterface;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BrandService implements DAOServiceInterface<Brand> {

    private BrandRepository brandRepository;

    @Override
    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand getObjectById(Long id) {
        return brandRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    public Brand persist(BrandDTO brandDTO) {
        return persist(brandDTO, null);
    }

    public Brand persist(BrandDTO brandDTO, Long id) {
        Brand brand = new Brand();
        brand.setId(id);
        brand.setName(brandDTO.getName());
        return brandRepository.saveAndFlush(brand);
    }
}
