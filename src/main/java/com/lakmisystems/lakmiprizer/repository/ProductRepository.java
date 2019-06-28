package com.lakmisystems.lakmiprizer.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lakmisystems.lakmiprizer.entity.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Serializable>{
}