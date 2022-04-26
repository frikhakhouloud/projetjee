package com.ppe.bestdeal.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppe.bestdeal.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande,Long>{

}
