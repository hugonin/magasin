package com.hugonin.magasin.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "date")
    private Timestamp date;

    @ManyToMany
    @JoinTable(
            name = "commande_has_produit",
            joinColumns = @JoinColumn(name = "commande_id", referencedColumnName = "id"),
            inverseJoinColumns =  @JoinColumn(name = "produit_id", referencedColumnName = "id")
    )
    private List<Produit> produits;



}
