package com.hugonin.magasin.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prix")
    private float prix;

    @ManyToOne
    @JoinColumn(name = "commande_has_produit", referencedColumnName = "id")
    private Categorie categorie;

}
