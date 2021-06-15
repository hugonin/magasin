package com.hugonin.magasin.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hugonin.magasin.dtos.GetCategoriesDTO;
import com.hugonin.magasin.models.Categorie;
import com.hugonin.magasin.repositories.CategorieRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CategorieService {

    CategorieRepository categorieRepository;
    private ObjectMapper mapper;

    public CategorieService(CategorieRepository categorieRepository, ObjectMapper mapper) {
        this.categorieRepository = categorieRepository;
        this.mapper = mapper;
    }

    public Optional<Categorie> findByNom(String nom) {
        return this.categorieRepository.findByNom(nom);
    }

    public List<GetCategoriesDTO> findAll() {
        List<Categorie> categories = this.categorieRepository.findAll();
        List<GetCategoriesDTO> getCategoriesDTOS = new ArrayList<>();
        categories.forEach(categorie -> {
            getCategoriesDTOS.add(
                    this.mapper.convertValue(categorie, GetCategoriesDTO.class)
            );
        });
        return getCategoriesDTOS;
    }

    public GetCategoriesDTO findById(Long id) {
        return mapper.convertValue(this.categorieRepository.findById(id).get(), GetCategoriesDTO.class);
    }

    public Categorie save(Categorie categorie) {
        return this.categorieRepository.save(categorie);
    }

    public void delete(Categorie categorie) {
        this.categorieRepository.delete(categorie);
    }


}
