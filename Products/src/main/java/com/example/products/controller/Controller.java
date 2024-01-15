package com.example.products.controller;


import com.example.products.entities.Category;
import com.example.products.entities.Product;
import com.example.products.models.ProductDTO;
import com.example.products.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin("*")
public class Controller {
    @Autowired
    private Service service;

    @PostMapping("/api/products/add")
    public Product addProduct(@RequestBody ProductDTO productDTO) {
        return service.addProduct(productDTO);
    }
    @GetMapping("api/getCategories")
    public List<Category> getCategories(){
        return Arrays.asList(Category.values());
    }
    @GetMapping("/api/products/get")
    public List<Product> getAllProduct() {
        return service.getAllCourses();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return service.getProductById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody ProductDTO updatedProduct) {
        return service.updateProduct(id, updatedProduct);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
    }
    @GetMapping("/api/products/category/{category}")
    public List<Product> getProductByCategory(@PathVariable String category){
        return this.service.getProductByCategory(category);
    }
}
