package com.hugonin.magasin.controllers;

import com.hugonin.magasin.dtos.GetProduitsDTO;
import com.hugonin.magasin.models.Produit;
import com.hugonin.magasin.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("produits")
public class ProduitController {

    @Autowired
    ProduitService produitService;

    @GetMapping
    public List<GetProduitsDTO> findAll() {
        return produitService.findAll();
    }

    @GetMapping("{id}")
    public GetProduitsDTO findById(@PathVariable Long id) {
        return produitService.findById(id);
    }

    @GetMapping("/nom/{nom}")
    public Optional<Produit> findByNom(@PathVariable String nom) {
        Optional<Produit> produit = produitService.findByNom(nom);
        return produit;
    }

    @PostMapping
    public Produit save(@RequestBody Produit produit) {
        return produitService.save(produit);
    }

    @PutMapping
    public Produit edit(@RequestBody Produit produit) {
        return produitService.save(produit);
    }

    @DeleteMapping
    public void delete(@RequestBody Produit produit) {
        produitService.delete(produit);
    }
}
