package com.prizer.model;

import com.prizer.entity.Productos;

public class MProductos {
	public MProductos() {
		
	}
	public MProductos(Productos producto) {
		this.id = producto.getId();
		this.identificador = producto.getIdentificador();
		this.nombre = producto.getNombre();
		this.contenido = producto.getContenido();
		this.descripcion = producto.getDescripcion();
		this.costo = producto.getCosto();
		this.comodin1 = producto.getComodin1();
		this.comodin2 = producto.getComodin2();
	}
	public MProductos(long id, String identificador, String nombre, String contenido, String descripcion, double costo, double comodin1, String comodin2) {
		this.id = id;
		this.identificador = identificador;
		this.nombre = nombre;
		this.contenido = contenido;
		this.descripcion = descripcion;
		this.costo = costo;
		this.comodin1 = comodin1;
		this.comodin2 = comodin2;
	}
	private long id;
	private String identificador;
	private String nombre;
	private String contenido;
	private String descripcion;
	private double costo;
	private double comodin1;
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
