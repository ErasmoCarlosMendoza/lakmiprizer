package com.prizer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.prizer.converter.Convertidor;
import com.prizer.entity.Productos;
import com.prizer.model.MProductos;
import com.prizer.repository.ProductosRepo;

@Service("servicio")
public class ProductosService {
	@Autowired
	@Qualifier("repositorio")
	private ProductosRepo repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	public boolean crear(Productos producto) {
		try {
			repositorio.save(producto);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	public boolean actualizar(Productos producto) {
		try {
			repositorio.save(producto);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	public boolean borrar(String nombre, String identificador) {
		try {
			Productos producto = repositorio.findByNombreAndIdentificador(nombre, identificador);
			repositorio.delete(producto);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	public List<MProductos> obtener(){
		return convertidor.convertirLista(repositorio.findAll());
	}
	public Productos get(String nombre) {
		return repositorio.findByNombre(nombre);
	}
}
