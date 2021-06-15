package com.hugonin.magasin.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hugonin.magasin.dtos.GetClientsDTO;
import com.hugonin.magasin.models.Client;
import com.hugonin.magasin.repositories.ClientRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientService {

    ClientRepository clientRepository;
    private ObjectMapper mapper;

    public ClientService(ClientRepository clientRepository, ObjectMapper mapper) {
        this.clientRepository = clientRepository;
        this.mapper = mapper;
    }

    public Optional<Client> findByNom(String nom) {
        return this.clientRepository.findByNom(nom);
    }

    public List<GetClientsDTO> findAll() {
        List<Client> clients = this.clientRepository.findAll();
        List<GetClientsDTO> getClientsDTOS = new ArrayList<>();
        clients.forEach(client -> {
            getClientsDTOS.add(
                    this.mapper.convertValue(client, GetClientsDTO.class)
            );
        });
        return getClientsDTOS;
    }

    public GetClientsDTO findById(Long id) {
        return mapper.convertValue(this.clientRepository.findById(id).get(), GetClientsDTO.class);
    }

    public Client save(Client client) {
        return this.clientRepository.save(client);
    }

    public void delete(Client client) {
        this.clientRepository.delete(client);
    }


}
