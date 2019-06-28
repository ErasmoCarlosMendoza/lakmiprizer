package com.lakmisystems.lakmiprizer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lakmisystems.lakmiprizer.services.PriceService;

@Controller
@RequestMapping("/api/price")
public class PriceController {
	@Autowired
    @Qualifier("priceService")
    PriceService priceService;
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
    public String createPrice() {
        return "Crea cotizacion";
    }
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	@ResponseBody
    public String addProduct(@PathVariable Long id) {
        return "Agrega producto a cotizacion";
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    @ResponseBody
    public String deleteProduct(@PathVariable Long id) {
        return "Elimina producto de cotizacion";
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    @ResponseBody
    public String getPrice(@PathVariable Long id) {
        return priceService.getTotal().toString();
    }
}
