package com.springorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springorm.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

}
