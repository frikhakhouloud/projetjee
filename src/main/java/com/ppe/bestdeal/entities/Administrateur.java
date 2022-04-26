package com.ppe.bestdeal.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@DiscriminatorValue("admin")
public class Administrateur extends Compte{

}
