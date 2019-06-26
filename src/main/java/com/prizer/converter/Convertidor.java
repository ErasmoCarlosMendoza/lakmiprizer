package com.prizer.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.prizer.entity.Productos;
import com.prizer.model.*;

@Component("convertidor")
public class Convertidor {
	public List<MProductos> convertirLista(List<Productos> producto){
		List<MProductos> product = new ArrayList<>();
		for(Productos productos : producto) {
			product.add(new MProductos(productos));
		}
		return product;
		
	}
}
