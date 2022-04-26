package com.ppe.bestdeal.entities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Panier {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idPanier;
	//pour ne pas travailler d'une collection de type litse on va utiliser une collection de type map c'est mieu
		//ca nous permet de trouver les deal par le id 	
	 /*private Map<Long, LigneCommande>items=new HashMap<Long, LigneCommande>();
	
	public void addArticle (Deal d, int quantite) {
		//il faut verifier que le produit nexiste pas dans la liste
		if (items.get(d.getNumDeal())==null) {
			LigneCommande lc=new LigneCommande();
			lc.setDeal(d);
			lc.setQuantite(quantite);
			lc.setPrix(d.getNouveau_prix());
		}
		else {
			//si il est differnt de null je le recupere
			LigneCommande lc=items.get(d.getNumDeal());
			lc.setQuantite(lc.getQuantite()+quantite);
		}
	}
	
	public Collection<LigneCommande> getItems(){
		return items.values();
	}
	
	public double getTotal() {
		double total=0;
		for(LigneCommande lc:items.values()) {
			total+=lc.getPrix()*lc.getQuantite();
		}
		return total;
	}
	//pour connaitre le nombre de produit
	public int getSize() {
		return items.size();
	}
	//pour supprimer une ligne du panier
	public void deleteItem( Long idProduit) {
		items.remove(idProduit);
	}*/
	
}
