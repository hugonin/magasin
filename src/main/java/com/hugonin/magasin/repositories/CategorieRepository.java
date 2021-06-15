package com.hugonin.magasin.repositories;

import com.hugonin.magasin.models.Categorie;
import com.hugonin.magasin.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    Optional<Categorie> findByNom(String nom);
}
