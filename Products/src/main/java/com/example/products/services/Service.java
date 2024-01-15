package com.example.products.services;


import com.example.products.entities.Category;
import com.example.products.entities.Product;
import com.example.products.models.ProductDTO;
import com.example.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private ProductRepository productRepository;
    public Product addProduct(ProductDTO productDTO){
        return this.productRepository.save(
                new Product(
                        productDTO.getTitle(),
                        productDTO.getPrice(),
                        productDTO.isDisponibility(),
                        productDTO.getCategory(),
                        productDTO.getImgUrl()));

    }


    public List<Product> getAllCourses() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(()->new RuntimeException("product not found!"));
    }

    public Product updateProduct(Long id, ProductDTO updatedProduct) {
        Product product = productRepository.findById(id)
                .orElseThrow(()->new RuntimeException("course not found!"));
        product.setTitle(product.getTitle());
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
    public List<Product> getProductByCategory(String category){
        try {
            Category categorySelected = Category.valueOf(category);
            return this.productRepository.findAllByCategory(categorySelected);
        } catch (IllegalArgumentException e) {
            System.out.println("Category does not exist");
        }
        return null;
    }
}
