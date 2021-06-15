package com.hugonin.magasin.dtos;

import com.hugonin.magasin.models.Commande;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class GetCommandeDTO {
    private List<Commande> commandes;
}
