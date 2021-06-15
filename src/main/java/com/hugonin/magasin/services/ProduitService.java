package com.hugonin.magasin.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hugonin.magasin.dtos.GetProduitsDTO;
import com.hugonin.magasin.models.Produit;
import com.hugonin.magasin.repositories.ProduitRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProduitService {

    ProduitRepository produitRepository;
    private ObjectMapper mapper;

    public ProduitService(ProduitRepository produitRepository, ObjectMapper mapper) {
        this.produitRepository = produitRepository;
        this.mapper = mapper;
    }

    public Optional<Produit> findByNom(String nom) {
        return this.produitRepository.findByNom(nom);
    }

    public List<GetProduitsDTO> findAll() {
        List<Produit> produits = this.produitRepository.findAll();
        List<GetProduitsDTO> getProduitsDTOS = new ArrayList<>();
        produits.forEach(produit -> {
            getProduitsDTOS.add(
                    this.mapper.convertValue(produit, GetProduitsDTO.class)
            );
        });
        return getProduitsDTOS;
    }

    public GetProduitsDTO findById(Long id) {
        return mapper.convertValue(this.produitRepository.findById(id).get(), GetProduitsDTO.class);
    }

    public Produit save(Produit produit) {
        return this.produitRepository.save(produit);
    }

    public void delete(Produit produit) {
        this.produitRepository.delete(produit);
    }


}
