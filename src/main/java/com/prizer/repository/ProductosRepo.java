package com.prizer.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prizer.entity.Productos;

@Repository("repositorio")
public interface ProductosRepo extends JpaRepository<Productos, Serializable>{
	public abstract Productos findByNombre(String nombre);
	public abstract List<Productos> findByIdentificador(String identificador);
	public abstract Productos findByNombreAndIdentificador(String nombre, String identificador);
}
