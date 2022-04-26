package com.ppe.bestdeal.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
@DiscriminatorValue("client")
public class Client{
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idClient;
	private String nonClient;
	private String adresse;
	private String email;
	private String tel;
	@OneToMany(mappedBy = "client")
	private Collection<Commande> commandes;

}
