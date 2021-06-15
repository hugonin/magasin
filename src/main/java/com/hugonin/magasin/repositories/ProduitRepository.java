package com.hugonin.magasin.repositories;

import com.hugonin.magasin.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
