package com.ppe.bestdeal.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Categorie {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long NumCateg;

    private String nomCat;

    @OneToMany( mappedBy="categorie")
    private List<Deal> deals;


    public Categorie(long numCateg, String nomCat, List<Deal> deals) {
        NumCateg = numCateg;
        this.nomCat = nomCat;
        this.deals = deals;
    }
}
