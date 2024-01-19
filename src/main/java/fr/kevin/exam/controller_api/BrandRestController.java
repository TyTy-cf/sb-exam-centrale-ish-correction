package fr.kevin.exam.controller_api;

import fr.kevin.exam.DTO.BrandDTO;
import fr.kevin.exam.entity.Brand;
import fr.kevin.exam.mapping.APIUrlRoute;
import fr.kevin.exam.service.BrandService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(APIUrlRoute.URL_BRAND)
public class BrandRestController {

    private BrandService brandService;

    @GetMapping
    public List<Brand> list() {
        return brandService.findAll();
    }

    @GetMapping("/{id}")
    public Brand item(@PathVariable Long id) {
        return brandService.getObjectById(id);
    }

    @PostMapping
    public Brand create(@Valid @RequestBody BrandDTO brandDTO) {
        return brandService.persist(brandDTO);
    }

    @PutMapping("/{id}")
    public Brand update(@Valid @RequestBody BrandDTO brandDTO, @PathVariable Long id) {
        return brandService.persist(brandDTO, id);
    }

}