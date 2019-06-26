package com.prizer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="PRODUCTOS")
@Entity
public class Productos implements Serializable {
	public Productos() {
		
	}
	public Productos(long id, String identificador, String nombre, String contenido, String descripcion, double costo, double comodin1, String comodin2) {
		this.id = id;
		this.identificador = identificador;
		this.nombre = nombre;
		this.contenido = contenido;
		this.descripcion = descripcion;
		this.costo = costo;
		this.comodin1 = comodin1;
		this.comodin2 = comodin2;
	}

	@GeneratedValue
	@Id
	@Column(name="ID_Producto")
	private long id;
	
	@Column(name="IDE_Producto")
	private String identificador;
	
	@Column(name="NOM_Producto")
	private String nombre;
	
	@Column(name="CONT_Producto")
	private String contenido;
	
	@Column(name="DESC_Producto")
	private String descripcion;
	
	@Column(name="COST_Producto")
	private double costo;
	
	@Column(name="COM1_Producto")
	private double comodin1;
	
	@Column(name="COM2_Producto")
	private String comodin2;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getComodin1() {
		return comodin1;
	}

	public void setComodin1(double comodin1) {
		this.comodin1 = comodin1;
	}

	public String getComodin2() {
		return comodin2;
	}

	public void setComodin2(String comodin2) {
		this.comodin2 = comodin2;
	}
	
	
}
