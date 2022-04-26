package com.ppe.bestdeal.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class User {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idUser;
	private String userName;
	private String password;
	@OneToMany
	@JoinColumn(name="idUser")
	private Collection<Role> roles;

}
