package com.ppe.bestdeal.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ppe.bestdeal.DAO.*;
import com.ppe.bestdeal.entities.*;


@RestController
@RequestMapping(value="/categories")
public class CategorieController {
	@Autowired
    protected CategorieRepository CAR;
	
	 public List<Categorie> getAllCat()
	    {
	        return CAR.findAll();
	    }

	    public Categorie ajouter(@RequestBody Categorie ca)
	    {
	        this.CAR.save(ca); /*findbyid*/
	        return ca;
	    }

	    
	    
	    @PostMapping("/AddCat")
	    public Categorie ajouterCat(@RequestBody Categorie ca)
	    {
	        return CAR.save(ca);
	    }
	    
	   

	    @GetMapping("/GetAllCat")
	    public List<Categorie> afficherToutCat()
	    {
	        return CAR.findAll();
	    }


	    @GetMapping("GetIdCat/{id}")
	    public Optional<Categorie> getIdCat(Long id)
	    {
	        return CAR.findById(id);
	    }

	    @DeleteMapping("DeleteCat/{id}")
	    public void delete(@PathVariable("id") Long id)
	    {
	        CAR.deleteById(id);
	    }



	    @PutMapping("/UpdateCat")
	    public Categorie modifierCat(@RequestBody Categorie ca)
	    {
	        return CAR.save(ca);
	    }

}
