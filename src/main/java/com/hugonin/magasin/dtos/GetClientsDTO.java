package com.hugonin.magasin.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetClientsDTO {
    private String nom;
    private String prenom;
}
