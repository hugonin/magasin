package com.hugonin.magasin.controllers;

import com.hugonin.magasin.dtos.GetCategoriesDTO;
import com.hugonin.magasin.models.Categorie;
import com.hugonin.magasin.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("categories")
public class CategorieController {

    @Autowired
    CategorieService categorieService;

    @GetMapping
    public List<GetCategoriesDTO> findAll() {
        return categorieService.findAll();
    }

    @GetMapping("{id}")
    public GetCategoriesDTO findById(@PathVariable Long id) {
        return categorieService.findById(id);
    }

    @GetMapping("/nom/{nom}")
    public Optional<Categorie> findByNom(@PathVariable String nom) {
        Optional<Categorie> categorie = categorieService.findByNom(nom);
        return categorie;
    }

    @PostMapping
    public Categorie save(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }

    @PutMapping
    public Categorie edit(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }

    @DeleteMapping
    public void delete(@RequestBody Categorie categorie) {
        categorieService.delete(categorie);
    }
}
