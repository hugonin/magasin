package com.hugonin.magasin.controllers;

import com.hugonin.magasin.dtos.GetCommandesDTO;
import com.hugonin.magasin.models.Commande;
import com.hugonin.magasin.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("commandes")
public class CommandeController {

    @Autowired
    CommandeService commandeService;


    @GetMapping
    public List<GetCommandesDTO> findAll() {
        return commandeService.findAll();
    }

    @GetMapping("{id}")
    public GetCommandesDTO findById(@PathVariable Long id) {
        return commandeService.findById(id);
    }

    @GetMapping("/numero/{numero}")
    public Optional<Commande> findByNumero(@PathVariable String numero) {
        Optional<Commande> commande = commandeService.findByNumero(numero);
        return commande;
    }

    @PostMapping
    public Commande save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }

    @PutMapping
    public Commande edit(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }

    @DeleteMapping
    public void delete(@RequestBody Commande commande) {
        commandeService.delete(commande);
    }

}
