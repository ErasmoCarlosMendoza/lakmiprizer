package com.lakmisystems.lakmiprizer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PRODUCTS")
@Entity
public class Products implements Serializable {
	public Products() {
		
	}
	public Products(long id, String key, String name, String description, double price) {
		this.id = id;
		this.key = key;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	@GeneratedValue
	@Id
	@Column(name="ID")
	private long id;
	
	@Column(name="KEY")
	private String key;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="PRICE")
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
