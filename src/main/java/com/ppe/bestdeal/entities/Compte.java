package com.ppe.bestdeal.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name="Type_CPT",
discriminatorType=DiscriminatorType.STRING, length=2)


public class Compte {
		@Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)

	    private Long NumCompte;
	    private String nomC;
	    private String prenomC;
	    private String email;
	    private String mdp;
}
