package com.hugonin.magasin.controllers;

import com.hugonin.magasin.dtos.GetClientsDTO;
import com.hugonin.magasin.models.Client;
import com.hugonin.magasin.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping
    public List<GetClientsDTO> findAll() {
        return clientService.findAll();
    }

    @GetMapping("{id}")
    public GetClientsDTO findById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @GetMapping("/nom/{nom}")
    public Optional<Client> findByNom(@PathVariable String nom) {
        Optional<Client> client = clientService.findByNom(nom);
        return client;
    }

    @PostMapping
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @PutMapping
    public Client edit(@RequestBody Client client) {
        return clientService.save(client);
    }

    @DeleteMapping
    public void delete(@RequestBody Client client) {
        clientService.delete(client);
    }


}
