package com.hugonin.magasin.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hugonin.magasin.dtos.GetClientsDTO;
import com.hugonin.magasin.models.Client;
import com.hugonin.magasin.repositories.ClientRepository;
import com.hugonin.magasin.services.ClientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ClientService clientService(ClientRepository clientRepository, ObjectMapper mapper) {
        return new ClientService(clientRepository, mapper) ;
    }



}
