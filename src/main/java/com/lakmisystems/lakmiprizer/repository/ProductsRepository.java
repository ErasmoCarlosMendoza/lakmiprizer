package com.lakmisystems.lakmiprizer.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lakmisystems.lakmiprizer.entity.Products;

@Repository("repository")
public interface ProductsRepository extends JpaRepository<Products, Serializable>{
	public abstract Products findByName(String name);
	public abstract List<Products> findByKey(String key);
	public abstract Products findByNameAndKeyAndId(String name, String key, long id);
}