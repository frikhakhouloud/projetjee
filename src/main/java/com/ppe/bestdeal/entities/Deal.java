package com.ppe.bestdeal.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Deal {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long NumDeal;
    private String nomDeal;

    private double ancien_prix;

    private double pourcentage;

    private double nouveau_prix;

    private Long temps_rest;

    private int quantite; // la quantite du produit en stock

  //  private Long nb_vente;

    @ManyToOne
    @JoinColumn(name="nomCat") //jointure avec clé etrangère nomCat
    private Categorie categorie;



}
