package com.lakmisystems.lakmiprizer.model;

import com.lakmisystems.lakmiprizer.entity.Products;

public class ModelProducts {
	public ModelProducts() {
		
	}
	public ModelProducts(Products product) {
		this.id = product.getId();
		this.key = product.getKey();
		this.name = product.getName();
		this.description = product.getDescription();
		this.price = product.getPrice();
	}
	public ModelProducts(long id, String key, String name, String description, double price) {
		this.id = id;
		this.key = key;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	private long id;
	private String key;
	private String name;
	private String description;
	private double price;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
