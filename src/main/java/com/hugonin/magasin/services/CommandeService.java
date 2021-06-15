package com.hugonin.magasin.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hugonin.magasin.dtos.GetCommandesDTO;
import com.hugonin.magasin.models.Commande;
import com.hugonin.magasin.repositories.CommandeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CommandeService {

    CommandeRepository commandeRepository;
    private ObjectMapper mapper;

    public CommandeService(CommandeRepository commandeRepository, ObjectMapper mapper) {
        this.commandeRepository = commandeRepository;
        this.mapper = mapper;
    }

    public Optional<Commande> findByNumero(String numero) { return this.commandeRepository.findByNumero(numero); }

    public List<GetCommandesDTO> findAll() {
        List<Commande> commandes = this.commandeRepository.findAll();
        List<GetCommandesDTO> getCommandesDTOS = new ArrayList<>();
        commandes.forEach(commande -> {
            getCommandesDTOS.add(
                    this.mapper.convertValue(commandes, GetCommandesDTO.class)
            );
        });
        return getCommandesDTOS;
    }

    public GetCommandesDTO findById(Long id) {
        return mapper.convertValue(this.commandeRepository.findById(id).get(), GetCommandesDTO.class);
    }

    public Commande save(Commande commande) {
        return this.commandeRepository.save(commande);
    }

    public void delete(Commande commande) {
        this.commandeRepository.delete(commande);
    }



}
