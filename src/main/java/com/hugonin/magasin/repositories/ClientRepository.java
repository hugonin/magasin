package com.hugonin.magasin.repositories;

import com.hugonin.magasin.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByNom(String nom);
}
