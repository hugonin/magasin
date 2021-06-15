package com.hugonin.magasin.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetClientDTO {
    private String nom;
    private String prenom;
}
