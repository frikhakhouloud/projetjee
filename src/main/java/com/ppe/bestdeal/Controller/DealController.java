package com.ppe.bestdeal.Controller;
import com.ppe.bestdeal.DAO.*;
import com.ppe.bestdeal.entities.*;

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
@RequestMapping(value="/deals")
public class DealController {
	@Autowired
    protected DealRepository DR;

    public List<Deal> getAllD()
    {
        return DR.findAll();
    }

    public Deal ajouter(@RequestBody Deal d)
    {
        this.DR.save(d); /*findbyid*/
        return d;
    }

    @PostMapping("/AddD")
    public Deal ajouterD(@RequestBody Deal d)
    {
        return DR.save(d);
    }


    @GetMapping("GetIdD/{id}")
    public Optional<Deal> getIdD(Long id)
    {
        return DR.findById(id);
    }

    @DeleteMapping("DeleteD/{id}")
    public void delete(@PathVariable("id") Long id)
    {
        DR.deleteById(id);
    }



    @PutMapping("/UpdateD")
    public Deal modifierD(@RequestBody Deal d)
    {
        return DR.save(d);
    }


}
