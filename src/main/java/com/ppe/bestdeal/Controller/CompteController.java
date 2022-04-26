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
@RequestMapping(value="/comptes")
public class CompteController {
	@Autowired
    protected CompteRepository CR;

    public List<Compte> getAllC()
    {
        return CR.findAll();
    }

    public Compte ajouter(@RequestBody Compte c)
    {
        this.CR.save(c); /*findbyid*/
        return c;
    }

    @PostMapping("/AddC")
    public Compte ajouterC(@RequestBody Compte c)
    {
        return CR.save(c);
    }

    @GetMapping("/GetAllC")
    public List<Compte> afficherToutC()
    {
        return CR.findAll();
    }

    @GetMapping("GetIdC/{id}")
    public Optional<Compte> getIdC(Long id)
    {
        return CR.findById(id);
    }

    @DeleteMapping("DeleteC/{id}")
    public void delete(@PathVariable("id") Long id)
    {
        CR.deleteById(id);
    }



    @PutMapping("/UpdateC")
    public Compte modifierD(@RequestBody Compte c)
    {
        return CR.save(c);
    }

}
