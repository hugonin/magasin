package com.hugonin.magasin.repositories;

import com.hugonin.magasin.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
