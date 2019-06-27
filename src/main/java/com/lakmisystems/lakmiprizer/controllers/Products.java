package com.lakmisystems.lakmiprizer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/products")
public class Products {
 
    @RequestMapping(method=RequestMethod.POST)
    @ResponseBody
    public String addProduct() {
        return "Agrega producto o servicio a BD";
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    @ResponseBody
    public String deleteProduct(@PathVariable Long id) {
        return "Elimina un producto o servicio de la BD";
    } 
 
}
