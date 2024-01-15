package com.example.products.repository;

import com.example.products.entities.Category;
import com.example.products.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product , Long> {
    List<Product> findAllByCategory(Category category);
}
