package com.hugonin.magasin.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetProduitsDTO {
    private String nom;
    private float prix;
}
