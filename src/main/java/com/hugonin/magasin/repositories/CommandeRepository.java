package com.hugonin.magasin.repositories;

import com.hugonin.magasin.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
