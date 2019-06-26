package com.prizer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prizer.entity.Productos;
import com.prizer.model.MProductos;
import com.prizer.service.ProductosService;

@Controller
@RestController
@RequestMapping("/")
public class IController {
	@GetMapping("/")
	public String index() {
		return "index";
		
	}
	
	@Autowired
	@Qualifier("servicio")
	ProductosService service;
	
	@PutMapping("/producto")
	public boolean agregarProducto(@RequestBody Productos producto) {
		return service.crear(producto);
	}
	
	@PostMapping("/producto")
	public boolean actualizarProducto(@RequestBody Productos producto) {
		return service.actualizar(producto);
	}
	
	@DeleteMapping("/producto/{nombre}/{identificador}")
	public boolean eliminarProducto(@PathVariable("nombre") String nombre, @PathVariable("identificador") String identificador) {
		return service.borrar(nombre, identificador);
	}
	
	@GetMapping("/productos")
	public List<MProductos> obtenerProductos(){
		return service.obtener();
	}
	
	@GetMapping("/producto/{nombre}")
	public Productos getOne(@PathVariable("nombre") String nombre) {
		return service.get(nombre);
	}
	
}
