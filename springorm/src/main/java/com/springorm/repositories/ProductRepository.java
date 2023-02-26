package com.springorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springorm.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
