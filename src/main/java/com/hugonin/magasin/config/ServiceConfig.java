package com.hugonin.magasin.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hugonin.magasin.repositories.CategorieRepository;
import com.hugonin.magasin.repositories.ClientRepository;
import com.hugonin.magasin.repositories.CommandeRepository;
import com.hugonin.magasin.repositories.ProduitRepository;
import com.hugonin.magasin.services.CategorieService;
import com.hugonin.magasin.services.ClientService;
import com.hugonin.magasin.services.CommandeService;
import com.hugonin.magasin.services.ProduitService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ClientService clientService(ClientRepository clientRepository, ObjectMapper mapper) {
        return new ClientService(clientRepository, mapper) ;
    }

    @Bean
    public CommandeService commandeService(CommandeRepository commandeRepository, ObjectMapper mapper) {
        return new CommandeService(commandeRepository, mapper);
    }

    @Bean
    public ProduitService produitService(ProduitRepository produitRepository, ObjectMapper mapper) {
        return new ProduitService(produitRepository, mapper);
    }

    @Bean
    public CategorieService categorieService(CategorieRepository categorieRepository, ObjectMapper mapper) {
        return new CategorieService(categorieRepository, mapper);
    }



}
